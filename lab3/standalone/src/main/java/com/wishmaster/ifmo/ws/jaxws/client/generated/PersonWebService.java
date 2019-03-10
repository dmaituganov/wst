
package com.wishmaster.ifmo.ws.jaxws.client.generated;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1-SNAPSHOT
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonWebService", targetNamespace = "http://jaxws.ws.ifmo.wishmaster.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonWebService {


    /**
     * 
     * @return
     *     returns java.util.List<com.wishmaster.ifmo.ws.jaxws.client.generated.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllStudents", targetNamespace = "http://jaxws.ws.ifmo.wishmaster.com/", className = "com.wishmaster.ifmo.ws.jaxws.client.generated.GetAllStudents")
    @ResponseWrapper(localName = "getAllStudentsResponse", targetNamespace = "http://jaxws.ws.ifmo.wishmaster.com/", className = "com.wishmaster.ifmo.ws.jaxws.client.generated.GetAllStudentsResponse")
    @Action(input = "http://jaxws.ws.ifmo.wishmaster.com/PersonWebService/getAllStudentsRequest", output = "http://jaxws.ws.ifmo.wishmaster.com/PersonWebService/getAllStudentsResponse")
    public List<Student> getAllStudents();

    /**
     * 
     * @param filter
     * @return
     *     returns java.util.List<com.wishmaster.ifmo.ws.jaxws.client.generated.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchStudents", targetNamespace = "http://jaxws.ws.ifmo.wishmaster.com/", className = "com.wishmaster.ifmo.ws.jaxws.client.generated.SearchStudents")
    @ResponseWrapper(localName = "searchStudentsResponse", targetNamespace = "http://jaxws.ws.ifmo.wishmaster.com/", className = "com.wishmaster.ifmo.ws.jaxws.client.generated.SearchStudentsResponse")
    @Action(input = "http://jaxws.ws.ifmo.wishmaster.com/PersonWebService/searchStudentsRequest", output = "http://jaxws.ws.ifmo.wishmaster.com/PersonWebService/searchStudentsResponse")
    public List<Student> searchStudents(
        @WebParam(name = "filter", targetNamespace = "")
        StudentsFilter filter);

}