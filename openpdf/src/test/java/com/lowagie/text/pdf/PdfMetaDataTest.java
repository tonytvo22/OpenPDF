package com.lowagie.text.pdf;

import java.io.FileNotFoundException;

import org.junit.Test;

import com.lowagie.text.Annotation;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Rectangle;

public class PdfMetaDataTest {

    @Test
    public void testAddAuthor() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testAuthorMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Author Meta Data", "Author");
            doc.add(ann);

            boolean author = doc.addAuthor("John Doe");
            assert (author);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullAuthor() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testNullAuthorMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Null Author Meta Data", "Author");
            doc.add(ann);

            boolean author = doc.addAuthor(null);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test
    public void testAddCreator() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testCreatorMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Creator Meta Data", "Creator");
            doc.add(ann);

            boolean creator = doc.addCreator("John Doe");
            assert (creator);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullCreator() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testNullCreatorMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Null Creator Meta Data", "Creator");
            doc.add(ann);

            boolean creator = doc.addCreator(null);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test
    public void testAddCreationDate() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testCreationDateMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Creation Data Meta Data", "Date");
            doc.add(ann);

            boolean date = doc.addCreationDate();
            assert (date);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test
    public void testAddTitle() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testTitleMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Title Meta Data", "Title");
            doc.add(ann);

            boolean title = doc.addTitle("Testing title");
            assert (title);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullTitle() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testNullTitleMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Null Title Meta Data", "Title");
            doc.add(ann);

            boolean title = doc.addTitle(null);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test
    public void testAddKeyboard() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testKeywordMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Keyword Meta Data", "Title");
            doc.add(ann);

            boolean keyword = doc.addKeywords("Testing, key, words, pdf, tester");
            assert (keyword);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }


    @Test(expected = NullPointerException.class)
    public void testAddNullKeyboard() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testNullKeywordMetaData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Null Keyword Meta Data", "Title");
            doc.add(ann);

            boolean keyword = doc.addKeywords(null);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test
    public void testAddHeader() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testAddHeaderData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Delete Header Meta Data", "Header");
            doc.add(ann);

            boolean header = doc.addHeader("my header", "my content");
            assert (header);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullHeader() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testAddNullHeaderData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Delete Header Meta Data", "Header");
            doc.add(ann);

            boolean header = doc.addHeader(null, null);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test
    public void testAddSubject() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testAddSubjectData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Subject Meta Data", "Subject");
            doc.add(ann);

            boolean subject = doc.addSubject("My subject");
            assert (subject);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullSubject() throws FileNotFoundException, DocumentException {
        Document doc = PdfTestBase.createPdf("testAddNullSubjectData.pdf");
        try {
            doc.open();
            assert (doc.isOpen());
            doc.newPage();
            assert (doc.newPage());

            Annotation ann = new Annotation("Test Null Subject Meta Data", "Subject");
            doc.add(ann);

            boolean subject = doc.addSubject(null);
        } finally {
            if (doc != null) {
                doc.close();
            }
        }
    }
}
