import { useState } from "react";


function SmartCounter(){
    const[up,number]=useState(1);

    return(
        <>
        <h1>{number}</h1>
        <button onClick={()=> up(number+1)}>Aumentar</button>
        </>
    )
}

export default SmartCounter;