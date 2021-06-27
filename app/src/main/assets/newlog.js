var b=document.getElementById('callbox');
var m=document.getElementById('model');
var c=document.getElementById('close');

b.onclick=function(){
    m.style.display="block";
}
c.onclick=function(){
    m.style.display="none";
}
window.onclick=function(e){
    if(e.target==m){
        m.style.display="none";
    }
}
// This is for login
function show()
{
    var em=document.getElementById('email');
    var pas=document.getElementById('pass');

    if(em.value=="nomeshtighare@gmail.com")
    {
        if(pas.value=="12345")
        {
            alert("login succesfull");
            m.style.display="none";
        }
        else
        {
            alert("Password Incorect");
        }
    }
    else
    {
        alert("email is incorrect");
    }
}