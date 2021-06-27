var sindex=0;

slideshow(sindex);

function goslide(n){
    sindex=sindex+n;
    slideshow(sindex+-n)
}

function slideshow(n)
{
    var i;

    var s=document.getElementsByClassName('slide');
    var count=s.length;

    if(n>count)
    {
        sindex=1;

    }
    if(n<1)
    {
        sindex=count;
    }
    for(i=0;i<count;i++)
    {
        s[i].style.display='none';          
    }
    s[sindex-1].style.display="block";
   
}