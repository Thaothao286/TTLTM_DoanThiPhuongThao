/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author minhm
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.packtpub.com:80/books/content/support");
        displayURL(url);

    }

    private static void displayURL(URL url) {
        System.out.println("URL: " + url);
        System.out.printf(" Protocol: %-32s Host: %-32s\n",
                url.getProtocol(), url.getHost());
        System.out.printf(" Port: %-32d Path: %-32s\n",
                url.getPort(), url.getPath());
        System.out.printf(" Authority: %-32s Query: %-32s\n",
                url.getAuthority(), url.getQuery());
        System.out.println(" User Info: " + url.getUserInfo());
    }
}
