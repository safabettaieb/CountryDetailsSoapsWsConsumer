//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.02.23 à 09:50:08 PM WAT 
//


package com.safa.country.soap.ws.countrydetails;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.safa.country.soap.ws.countrydetails package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.safa.country.soap.ws.countrydetails
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountryDetailsRequest }
     * 
     */
    public CountryDetailsRequest createCountryDetailsRequest() {
        return new CountryDetailsRequest();
    }

    /**
     * Create an instance of {@link GetCountryResponse }
     * 
     */
    public GetCountryResponse createGetCountryResponse() {
        return new GetCountryResponse();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

}
