document.addEventListener('DOMContentLoaded', function () {
  let forms = document.querySelectorAll('.php-email-form');

  forms.forEach(function (form) {
      form.addEventListener('submit', function (event) {
          event.preventDefault(); // Prevent the default form submission behavior

          // Display the thank you message
          alert('Thank you! Your message has been received.\n We will get back to you shortly. !!');

          // Optionally, you can reset the form fields after displaying the message
          form.reset();
      });
  });
});