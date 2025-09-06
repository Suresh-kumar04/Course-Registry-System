
    
    
    function availabelcourses() {
    fetch('http://localhost:8080/availablecourse')
        .then(response => response.json())
        .then((courses) => {
            const dataTable = document.getElementById("coursetable");
            dataTable.innerHTML = ""; // Clear previous rows
            courses.forEach(course => {
                var row = `<tr>
                    <td>${course.id}</td>
                    <td>${course.duration}  days </td>
                    <td>${course.courseName}</td>
                    <td>${course.trainerName}</td>
                </tr>`;
                dataTable.innerHTML += row;
            });
        });
}
function showenrolled(){
    fetch('http://localhost:8080/registered')
        .then(response => response.json())
        .then((enroll) => {
            const dataTable = document.getElementById("enrolledtable");
            dataTable.innerHTML = ""; // Clear previous rows
            enroll.forEach(enroll => {
                var row = `<tr>
                    <td>${enroll.id}</td>
                    <td>${enroll.username} </td>
                    <td>${enroll.email}</td>
                    <td>${enroll.coursename}</td>
                </tr>`;
                dataTable.innerHTML += row;
            });
        });

}