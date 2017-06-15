package com.red.innopolis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        StringBuilder url = new StringBuilder("https://yandex.ru/search/?text=");
        while (true)
        {
            BufferedReader get = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите запрос - ");
            String str = get.readLine();
            
            if (str.equals("exit"))
            {
                System.out.println("Попользовались и хватит!");
                System.exit(0);
            }
    
            URL obj = new URL(url.append(str).toString());
    
            BufferedReader in = new BufferedReader(new InputStreamReader(obj.openStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
    
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
    
            System.out.println(response.toString());
        }
    }
}
