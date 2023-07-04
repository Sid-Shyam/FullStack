var totalmarks = 100;

document.addEventListener("DOMContentLoaded", function() {
    marksScheme(85);
});

function marksScheme(marks) {
    var percentage = (marks / totalmarks) * 100;

    // Update the progress bar value
    var progressBar = document.getElementById("progress");
    if (progressBar) {
        progressBar.value = percentage;

        // Update the progress bar label
        progressBar.innerHTML = percentage.toFixed(2) + "%";

        // Print the student's score
        console.log("Student score is: " + percentage);
    } else {
        console.error("Element with ID 'progress' not found.");
    }
}
