document.addEventListener('DOMContentLoaded', () => {
    const darkModeClass = 'dark-mode';
    const button = document.getElementById('mode-selector');
    const h1 = document.getElementById('page-title');
    const body = document.getElementsByTagName('body')[0];
    const footer = document.getElementsByTagName('footer')[0];

    function changeMode() {
        changeClasses();
        changeText();
    }

    function changeClasses() {
        button.classList.toggle(darkModeClass);
        h1.classList.toggle(darkModeClass);
        body.classList.toggle(darkModeClass);
        footer.classList.toggle(darkModeClass);
    }

    function changeText() {
        const isDarkMode = body.classList.contains(darkModeClass);
        button.innerHTML = isDarkMode ? 'Light Mode' : 'Dark Mode';
        h1.innerHTML = `${isDarkMode ? 'Dark' : 'Light'} Mode ON`;
    }

    button.addEventListener('click', changeMode);
});