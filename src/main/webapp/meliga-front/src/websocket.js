import { io } from 'socket.io-client';

const socket = io('http://localhost:8080'); 

export const createCall = (roomId) => {
  socket.emit('createRoom', roomId);
};

export const connectCall = (roomId) => {
  socket.emit('joinRoom', roomId);
};

export const sendMessage = (roomId, message) => {
  socket.emit('message', { roomId, message });
};