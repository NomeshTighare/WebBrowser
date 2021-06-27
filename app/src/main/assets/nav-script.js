var sindex=0;

slideshow(sindex);

function goslides(n) {
    slideshow(sindex += n);
  }
  
  function currentSlide(n) {
    slideshow(sindex = n);
  }
  

function slideshow(n)
{
    var i;
    var s=document.getElementsByClassName('slide');
    var dots = document.getElementsByClassName("dot");
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
    for (i=0;i<dots.length;i++) 
    {
        dots[i].className = dots[i].className.replace(" active", "");
    }
    s[sindex-1].style.display = "block";  
    dots[sindex-1].className += " active";
    
    setTimeout(slideshow,3000)
}