$(document).ready(function(){
    $(window).scroll(function(){
        if(this.scrollY > 20){
            $('.navbar').addClass("sticky");
        }else{
            $('.navbar').removeClass("sticky");
        }
        if(this.scrollY>500){
            $('.scroll-up-btn').addClass("show");
        }else{
            $('.scroll-up-btn').removeClass("show");
        }
    });
    
    //slide-up
    $('.scroll-up-btn').click(function(){
        $('html').animate({scrollTop:0});
    });


    //menu 
    $('.menu-btn').click(function(){
        $('.navbar .menu').toggleClass("active");
        $('.menu-btn i').toggleClass("active");
    });
    //typing animation
    var typed = new Typed(".typing",{
        strings: ["Developer","Freelancer"],
        typeSpeed:100,
        backSpeed:60,
        loop: true
    });

    var typed = new Typed(".typing-2",{
        strings: ["Developer","Freelancer"," Social Media Manager"],
        typeSpeed:100,
        backSpeed:60,
        loop: true
    });

    $('#submit-button').click(function(e) {
        e.preventDefault();
        console.log("clicking");
        sendMail();
    })

    function sendMail(){
        console.log();
        let email1 = $("#email1")
        let tname = $("#tname")
        let message = $("#msg")
        let subject = $("#subject")
        var tempParams={
            email1 : email1.val(),
            tname : tname.val(),
            message : message.val(),
            subject: subject.val()
        };
        emailjs.send('gmail','template_7hycsla',tempParams)
        .then(function(res){
            email1.val('');
            tname.val('')
            message.val('')
            subject.val('')
            alert("Email successfully sent!")
        })
    }

   
});




