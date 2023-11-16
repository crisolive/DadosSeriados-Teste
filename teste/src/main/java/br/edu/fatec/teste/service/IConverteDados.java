package br.edu.fatec.teste.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
