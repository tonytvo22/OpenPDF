package com.lowagie.text.pdf;

import java.nio.charset.StandardCharsets;

import org.bouncycastle.tsp.TimeStampToken;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PdfPKCS7Test {
    private PdfPKCS7 cut;

    private static final String PEM_TEST =
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtUDjnCiEOQPyOddmLEE4"
            + "Fax+pYNxJX6QfGjdbz/Z11k4n3xqUsIDKi1+ZvQesxJwIFvUlzI9cYs7GwgXFGth"
            + "xFeLlhYc/STVCwn5aBGE+8pRDNFFGdoQRIrZ/nap/WAtGAsolbIt6oiYuNFWIfBT"
            + "H/ECb+lGm5NfKJAPrDb6aCNxV1b2zNPffSrZG3NF67onhe96f6XLgMcwNtJT7uys"
            + "Hucx8TainGPGZVt/JXVooerTfgBcml7YIBgydwcpEmYeNnPnlwRBN7Gxciv0oSkg"
            + "fJZ5CyvQ2N7IbD+T+8XueFIRFRt69uJomef7RhaE48eh5uDSRtXhxF+gZvTaxP+V"
            + "HQIDAQAB";

    @Before
    public void setup() {
        String provider = null; // null for default provider
        byte[] contentKey = PEM_TEST.getBytes(StandardCharsets.US_ASCII);
        cut = new PdfPKCS7(contentKey, provider);
    }


    @Test
    public void getDigestNull() throws Exception {
        // when
        String digest = PdfPKCS7.getDigest(null);
        // then
        Assert.assertEquals("Digest must be null.", null, digest);
    }

    @Test
    public void getDigest() throws Exception {
        // when
        String digest = PdfPKCS7.getDigest("1.3.36.3.3.1.4");
        // then
        Assert.assertEquals("Digest must be found in the map.", "RIPEMD256", digest);
    }

    @Test
    public void getAlgorithm() throws Exception {
        // when
        String algorithm = PdfPKCS7.getAlgorithm("1.3.36.3.3.1.4");
        // then
        Assert.assertEquals("Algorithm not found.", "RSA", algorithm);
    }

    @Test
    public void getTimeStampToken() throws Exception {
        // when
        TimeStampToken timeStampToken = cut.getTimeStampToken();
        // then
        Assert.assertNotNull("TimeStampToken not found.", timeStampToken);
    }

    @Test
    public void getTimeStampDate() throws Exception {
    }

    @Test
    public void getOcsp() throws Exception {
    }

    @Test
    public void update() throws Exception {
    }

    @Test
    public void verify() throws Exception {
    }

    @Test
    public void verifyTimestampImprint() throws Exception {
    }

    @Test
    public void getCertificates() throws Exception {
    }

    @Test
    public void getSignCertificateChain() throws Exception {
    }

    @Test
    public void getCRLs() throws Exception {
    }

    @Test
    public void getSigningCertificate() throws Exception {
    }

    @Test
    public void getVersion() throws Exception {
        // when
        int version = cut.getVersion();

        // then
        Assert.assertEquals("Version is incorrect.", 0, version);
    }

    @Test
    public void getSigningInfoVersion() throws Exception {
    }

    @Test
    public void getDigestAlgorithm() throws Exception {
    }

    @Test
    public void getHashAlgorithm() throws Exception {
    }

    @Test
    public void loadCacertsKeyStore() throws Exception {
    }

    @Test
    public void loadCacertsKeyStore1() throws Exception {
    }

    @Test
    public void verifyCertificate() throws Exception {
    }

    @Test
    public void verifyCertificates() throws Exception {
    }

    @Test
    public void getOCSPURL() throws Exception {
    }

    @Test
    public void isRevocationValid() throws Exception {
    }

    @Test
    public void getIssuerFields() throws Exception {
    }

    @Test
    public void getSubjectFields() throws Exception {
    }

    @Test
    public void getEncodedPKCS1() throws Exception {
    }

    @Test
    public void setExternalDigest() throws Exception {
    }

    @Test
    public void getEncodedPKCS7() throws Exception {
    }

    @Test
    public void getEncodedPKCS71() throws Exception {
    }

    @Test
    public void getEncodedPKCS72() throws Exception {
    }

    @Test
    public void getAuthenticatedAttributeBytes() throws Exception {
    }

    @Test
    public void getReason() throws Exception {
    }

    @Test
    public void setReason() throws Exception {
    }

    @Test
    public void getLocation() throws Exception {
    }

    @Test
    public void setLocation() throws Exception {
    }

    @Test
    public void getSignDate() throws Exception {
    }

    @Test
    public void setSignDate() throws Exception {
    }

    @Test
    public void getSignName() throws Exception {
    }

    @Test
    public void setSignName() throws Exception {
    }

}