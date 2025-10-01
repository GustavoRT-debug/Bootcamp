import React, {Componentomponet} from 'react'

class twitter extends Componet{
  /*
  componetWillMount()
  {
    const{post}=this.pros
    console.log('componetWillMount')
  }
    */
  
  componetDidMount(){
    const{post}=this.pros
    console.log('componetDidMount',post)
  }
    
  render(){
    const{post}=this.props
    console.log('render',post)
     return(
        <div>{post.title.name}</div>
    )
  } 
}   
export default twitter
    