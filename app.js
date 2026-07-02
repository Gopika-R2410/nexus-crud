const API = "http://localhost:8080/api/students";

async function loadStudents() {
  const res = await fetch(API);
  const students = await res.json();

  const list = document.getElementById("list");
  list.innerHTML = "";

  students.forEach(s => {
    list.innerHTML += `
      <li class="flex justify-between border-b py-2">
        ${s.name} (${s.email})
        <button onclick="deleteStudent(${s.id})" class="text-red-500">X</button>
      </li>
    `;
  });
}

async function addStudent() {
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;

  await fetch(API, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify({ name, email })
  });

  loadStudents();
}

async function deleteStudent(id) {
  await fetch(`${API}/${id}`, { method: "DELETE" });
  loadStudents();
}

loadStudents();
