// src/webapp/src/websocket.js

import SockJS from 'sockjs-client';
import Stomp from 'stompjs';

var socket = new SockJS('/ws');
var stompClient = Stomp.over(socket);

stompClient.connect({}, function (frame) {
    console.log('Conectado: ' + frame);

    stompClient.subscribe('/topic/respostas', function (response) {
        console.log('Resposta: ' + response.body);
    });
});

// Função para enviar mensagens ao servidor
export function enviarMensagem(destino, mensagem) {
    stompClient.send(destino, {}, mensagem);
}

// Função para conectar-se a uma chamada específica
export function conectarNaChamada(id) {
    enviarMensagem("/app/join/" + id, id);
}
