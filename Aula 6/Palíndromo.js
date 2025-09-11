function palindromo(str) {
    const reversed = str.split('').reverse().join('');
    return str === reversed;
}

console.log(palindromo('raiar'));
console.log(palindromo('ama'));

palindromo();