package com.yoti.api.client;

/**
 * Details of the document used to create the Yoti account.
 *
 */
public interface DocumentDetails {
    /**
     * Return document type.
     * 
     * @return Return document type
     */
    DocumentType getType();

    /**
     * Return issuing country
     * 
     * @return Return issuing country
     */
    String getIssuingCountry();

    /**
     * Return issuing country, may contain letters.
     * 
     * @return Return issuing country, may contain letters.
     */
    String getDocumentNumber();

    /**
     * The date of expiration for the document.
     * 
     * @return The date of expiration for the document.
     */
    Date getExpirationDate();

    static enum DocumentType {
        PASSPORT
    }
}
