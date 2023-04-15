
const form = document.querySelector('form');
const nombre = document.querySelector('#nombre');
const fecha = document.querySelector('#fechaR');


form.addEventListener('submit', (event) => {
	event.preventDefault();
	
	// Validar que se han llenado todos los campos
	if (nombre.value === '' || fecha.value === '') {
		alert('Por favor llene todos los campos.');
	} else {
		alert('Queja Registrada.');
		form.reset();
	}
});