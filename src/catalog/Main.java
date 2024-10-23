package catalog;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import org.json.*;
import java.math.BigInteger;

public class Main {

    private static BigInteger decodeValue(String base, String value) {
        int baseInt = Integer.parseInt(base);
        return new BigInteger(value, baseInt);
    }

    private static BigInteger findConstantTerm(BigInteger[] xValues, BigInteger[] yValues, int k) {
        BigInteger c = BigInteger.ZERO;
        for (int i = 0; i < k; i++) {
            BigInteger term = yValues[i];
            for (int j = 0; j < k; j++) {
                if (i != j) {
                    term = term.multiply(BigInteger.ZERO.subtract(xValues[j]))
                            .divide(xValues[i].subtract(xValues[j]));
                }
            }
            c = c.add(term);
        }
        return c;
    }

    public static void main(String[] args) {
        try {
            
            String jInput1 = new String(Files.readAllBytes(Paths.get("input1.json")));
            String jInput2 = new String(Files.readAllBytes(Paths.get("input2.json")));

            processJsonInput(jInput1);
            processJsonInput(jInput2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processJsonInput(String jsonInput) {
        JSONObject jsonObject = new JSONObject(jsonInput);
        JSONObject keysObject = jsonObject.getJSONObject("keys");
        int n = keysObject.getInt("n");
        int k = keysObject.getInt("k");

        BigInteger[] xValues = new BigInteger[n];
        BigInteger[] yValues = new BigInteger[n];
        int index = 0;

        for (String key : jsonObject.keySet()) {
            if (!key.equals("keys")) {
                BigInteger x = new BigInteger(key);
                JSONObject point = jsonObject.getJSONObject(key);
                String base = point.getString("base");
                String value = point.getString("value");

                BigInteger y = decodeValue(base, value);
                xValues[index] = x;
                yValues[index] = y;
                index++;
            }
        }

        BigInteger constantTerm = findConstantTerm(xValues, yValues, k);

        System.out.println(" c is " + constantTerm);
    }
}