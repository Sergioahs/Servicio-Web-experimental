var mensaje = '<Envelope xmlns= "http://schemas.xmlsoap.org/soap/envelope">' +
'<body>' +
'<DatosRequest xmlns="http://www.example.org/calculadora/">'+
'<a>'+ document.getElementById('nombre').value + '</a>'+
        '<b>'+ document.getElementById('edad').value + ' </b>'+
        '<c>'+ document.getElementById('ingresoMensual').value + ' </c>'+
        '<d>'+ document.getElementById('cancer').value + ' </d>'+
    '</DatosRequest>'+
'</body>'+
'</Envelope>'

function soap(){
    ini()
    axios.post('http://localhost:8080/ws/calculadora', mensaje, {
        headers : {
            'Content Type' : 'text/xml',
            'SOAPAction' : ''
        }
    })
    .then(function(response){
        console.log(response.data);
        document.getElementById('r').value = resul(response.data);
    })
    .catch(err => console.log(err))
}

function resul(rXml){
    var parser = new DOMParser();
    var xmlDoc = parser.parseFromString(rXml, "text/html");
    var resultado = xmlDoc.getElementsByTagName("ns2:dameDatos")[0].childNodes[0].nodeValue;
    return resultado;
}