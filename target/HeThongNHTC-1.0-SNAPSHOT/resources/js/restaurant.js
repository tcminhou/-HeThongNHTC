
function loadRestaurants(endpoint) {
    fetch(endpoint).then(function (res) {
        return res.json();
    }).then(function (data) {
        console.info(data);
        let d = document.getElementById("employRes");
        let msg = "";
        for (let i = 0; i < data.length; i++) {
            msg += `
                <tr id="row${data[i].id}">
                    <td><img src="${data[i].image}" width="120" /></td>
                    <td>${data[i].name}</td>
                    <td>${data[i].road} ${data[i].ward} ${data[i].district}</td>
                    <td>${data[i].hotline}</td>
                    <td>${data[i].hotline}</td>
                    <td>${data[i].status}</td>
                    <td>
                        <div class="spinner-border text-success" style="display:none" id="load${data[i].id}"></div>
                        <button class="btn btn-primary" >Duyệt</button>
                        <button class="btn btn-danger" >Không Duyệt</button>
                    </td>            
                </tr>`;

        }

        d.innerHTML = msg;

        let d2 = document.getElementById("myLoading");
        d2.style.display = "none";
    });

}


