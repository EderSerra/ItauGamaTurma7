function solicitar(event){
    event.preventDefault(); 
    let solicitante = document.getElementById('idSolicitante').value;
    let data = document.getElementById('dataPedido').value;
    let hora = document.getElementById('horaPedido').value;

    let msgPedido = {
        solicitante: {
            id: solicitante
        },
        data: new Date(data).toLocaleDateString('pt-BR',{timeZone:'UTC'}),
        hora: hora + ":00",
        status:'P'
    }

    let cabecalho = {
        method: 'POST',
        body: JSON.stringify(msgPedido),
        headers:{
            'Content-type':'application/json'
        }
    }

    fetch('http://localhost:8080/pedidos/novo', cabecalho)
    .then( res => tratarResposta(res) ); 
}

function tratarResposta(res){

    if(res){
        document.getElementById('idSolicitante').value = "";
        document.getElementById('dataPedido').value = "";
        document.getElementById('horaPedido').value = "";
        alert("sucesso");
    }else{
        alert("Erro");
    }

}