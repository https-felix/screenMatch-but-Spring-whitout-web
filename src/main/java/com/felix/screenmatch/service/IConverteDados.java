package com.felix.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);

    //o "<T> T" é tipo, "vou receber algo, mas meia noite eu te conto(não sei que formato mas tá pra vir)".
    //T = genérico
}
