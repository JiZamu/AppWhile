var nombre;
var escuela;

function validacion()
{
    nombre=document.getElementById("nombre").value;
    escuela=document.getElementById("escuela").value;
    otros=document.getElementById("otros").value;
    var f1=0;    
    
    for(var i = 0; i < formulario.elementos.length; i++)
    { 
        if(formulario.elementos[i].checked)
            f1=1;        
    }        
    if(nombre==null || nombre.length==0)
    {
        alert("Tu nombre no debe de estar vacio");
        return false;
    }
    else if(escuela==null || escuela.length==0)
    {
        alert("Tu escuela no debe de estar vacio");
        return false;
    }  
    if(f1==1 || otros.length!=0 ) 
        return true;
    else
    {
        alert("Seleccione una opcion de material o sugiera uno");
        return false;
    }

}

