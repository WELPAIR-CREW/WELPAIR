function includeHTML() {
    document.querySelectorAll('.include').forEach(el => {
        const target = el.dataset.includeHtml;
        if (target) {
            let xhttp = new XMLHttpRequest();

            xhttp.onreadystatechange = function() {
                if (this.readyState === XMLHttpRequest.DONE) {
                    this.status === 200 ? (el.innerHTML = this.responseText) : null;
                    this.status === 404 ? (el.innerHTML = 'response text not fount') : null;
                }
            }

            xhttp.open('get', target, true);
            xhttp.send();

            return;
        }
    });
}

window.onload = includeHTML;