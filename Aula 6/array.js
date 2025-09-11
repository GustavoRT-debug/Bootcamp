function substituirPares(arr) {
    if (arr.length === 0) return -1; 

    return arr.map(num => (num !== 0 && num % 2 === 0 ? 0 : num));
}

console.log(substituirPares([1, 3, 4, 6, 80, 33, 23, 90]));
console.log(substituirPares([]));

