function Counter(){
    let number=10;

    function up(){
        number=number+1;
        document.getElementById("conterbox").innerHTML=number;
        console.log(number);
    }
    return(
        <>
        <h1 id="counterbox">{number}</h1>
        <button onClick={up}>Aumentar</button>
        </>
    )
}

export default Counter;