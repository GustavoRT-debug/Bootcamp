function calculadora() {
    const operacao = Number(prompt(
        'Escolha uma opção: \n 1- Soma (+)\n 2- Subtração (-)\n 3- Multiplicação (*)\n 4- Divisão (/)\n 5- Divisão Inteira (%)\n 6- Potenciação (**)'
    ));

    let n1 = Number(prompt("Insira o 1º valor: "));
    let n2 = Number(prompt("Insira o 2º valor: "));
    let resultado;

    function soma() {
        resultado = n1 + n2;
        alert(`${n1} + ${n2} = ${resultado}`);
    }

    function subtracao() {
        resultado = n1 - n2;
        alert(`${n1} - ${n2} = ${resultado}`);
    }

    function multiplicacao() {
        resultado = n1 * n2;
        alert(`${n1} * ${n2} = ${resultado}`);
    }

    function divisao() {
        resultado = n1 / n2;
        alert(`${n1} / ${n2} = ${resultado}`);
    }

    function divisaoInteira() {
        resultado = n1 % n2;
        alert(`O resto de ${n1} dividido por ${n2} é igual a ${resultado}`);
    }

    function potenciacao() {
        resultado = n1 ** n2;
        alert(`${n1} ** ${n2} = ${resultado}`);
    }

    if (operacao == 1) {
        soma();
    } else if (operacao == 2) {
        subtracao();
    } else if (operacao == 3) {
        multiplicacao();
    } else if (operacao == 4) {
        divisao();
    } else if (operacao == 5) {
        divisaoInteira();
    } else if (operacao == 6) {
        potenciacao();
    } else {
        alert("Opção inválida!");
    }
}

calculadora();
