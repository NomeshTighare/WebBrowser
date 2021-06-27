var sindex=0;

slideshow();

function slideshow()

{
    var i;
    var s=document.getElementsByClassName('slide');
    var count=s.length;
    for(i=0;i<count;i++)
    {
        s[i].style.display='none';          
    }
    sindex++;
    if(sindex>count)
    {
        sindex=1;
    }
    s[sindex-1].style.display="block";
    setTimeout(slideshow,3000)
}