function kakaopost() {
    new daum.Postcode({
        oncomplete: function(data) {
            document.querySelector("#zipcode").value = data.zonecode;
            document.querySelector("#addBasic").value =  data.address
        }
    }).open();
}