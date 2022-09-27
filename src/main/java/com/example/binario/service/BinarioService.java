package com.example.binario.service;

import com.example.binario.controller.BinarioRequest;

public interface BinarioService {

    BinarioRequest conversion (BinarioRequest numero);

}
//numero es lo que voy a recibir en el request
//y conversion es mi resultado