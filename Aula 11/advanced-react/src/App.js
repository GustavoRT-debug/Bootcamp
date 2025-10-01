import React, {Componentomponet} from 'react'
import Twitter from './Twitter'

class App extends Componet{
  

  render(){

    const post=[{title:'xpto',
      description:'foo'

    },{
      title:'xpto',
      description:'foo'
    }]

    return(
      <twitter post={post}/>
    )
  }
}

export default App