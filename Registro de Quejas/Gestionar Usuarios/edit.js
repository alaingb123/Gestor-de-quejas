const form = document.querySelector('form');
const usernameInput = document.querySelector('#username');
const emailInput = document.querySelector('#email');
const passwordInput = document.querySelector('#password');
const confirmPasswordInput = document.querySelector('#confirm-password');

form.addEventListener('submit', (e) => {
	e.preventDefault();
	
	const username = usernameInput.value;
	const email = emailInput.value;
	const password = passwordInput.value;
	const confirmPassword = confirmPasswordInput.value;
	
	// Hacer aquí la validación de los datos del usuario
	
	if (password !== confirmPassword) {
		alert('Las contraseñas no coinciden. Por favor, inténtalo de nuevo.');
		return;
	}
	
	// Hacer aquí la lógica de registro del usuario
	
	alert(`Usuario ${username} editado exitosamente.`);
	window.location.href = 'file:///D:/Escuela/PW/Registro%20de%20Quejas/Principal/dashboard.html'; // Redirigir a la página de inicio de sesión
});