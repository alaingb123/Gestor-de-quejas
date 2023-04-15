
const form = document.querySelector('form');
const usernameInput = document.querySelector('#username');
const passwordInput = document.querySelector('#password');

form.addEventListener('submit', (e) => {
	e.preventDefault();
	
	const username = usernameInput.value;
	const password = passwordInput.value;
	
	// Hacer aquí la validación de usuario y contraseña
	
	if (username === 'admin' && password === 'admin') {
		window.location.href = 'file:///D:/Escuela/PW/Registro%20de%20Quejas/Principal/dashboard.html'; // Redirigir a la página del dashboard
	} else {
		alert('Usuario o password incorrectos. Por favor, intentalo de nuevo.');
	}
});