package br.com.alura.ecommerce;

import com.knuddels.jtokkit.Encodings;
import com.knuddels.jtokkit.api.Encoding;
import com.knuddels.jtokkit.api.EncodingRegistry;
import com.knuddels.jtokkit.api.EncodingType;
import com.knuddels.jtokkit.api.ModelType;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class ContadorDeTokens {
    public static void main(String[] args) {
        EncodingRegistry registry = Encodings.newDefaultEncodingRegistry();
        Encoding enc = registry.getEncodingForModel(ModelType.GPT_3_5_TURBO);
        var count = enc.countTokens("Identifique o perfil de compra de cada cliente");

        System.out.println("Quantidade de tokens: " + count);

        var custo = new BigDecimal(count).divide(new BigDecimal("1000")).multiply(new BigDecimal("0.0010"));
        System.out.println("Custo da requisição: " + custo);
    }
}
