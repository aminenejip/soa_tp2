package org.example.service;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;

@WebService
public interface calculatriceinterface {
    @WebMethod
    double addition(double a,double b);
    double soustraction(double a,double b);
    double multiplication(double a, double b);
    double division(double a,double b);
}
