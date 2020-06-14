package com.johanavillatoro.textospeech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button hablarAhoraBoton,hablarAhoraBoton2;
    private EditText editText;
    TTSManager ttsManager = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ttsManager = new TTSManager();
        ttsManager.init(this);

        //Blanca Nieves
        hablarAhoraBoton = findViewById(R.id.bt_speak);
        //La Sirenita
        hablarAhoraBoton2 = findViewById(R.id.bt_speak2);

        //Blanca Nieves
        hablarAhoraBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "El cuento de Blanca nieves comienza cuando Un día de invierno la Reina miraba cómo caían los copos de nieve mientras cosía. Le cautivaron de tal forma que se despistó y se pinchó en un dedo dejando caer tres gotas de la sangre más roja sobre la nieve. En ese momento pensó:\n" +
                        "Cómo desearía tener una hija así, blanca como la nieve, sonrosada como la sangre y de cabellos negros como el ébano." +
                        "Al cabo de un tiempo su deseo se cumplió y dio a luz a una niña bellísima, blanca como la nieve, sonrosada como la sangre y con los cabellos como el ébano. De nombre le pusieron Blancanieves, aunque su nacimiento supuso la muerte de su madre.\n" +
                                "\n" +
                                "Pasados los años el rey viudo decidió casarse con otra mujer. Una mujer tan bella como envidiosa y orgullosa. Tenía ésta un espejo mágico al que cada día preguntaba:\n" +
                                "\n" +
                                "- Espejito espejito, contestadme a una cosa ¿no soy yo la más hermosa?\n" +
                                "\n" +
                                "Y el espejo siempre contestaba:\n" +
                                "\n" +
                                "- Sí, mi Reina. Vos sois la más hermosa.\n" +
                                "\n" +
                                "Pero el día en que Blancanieves cumplió siete años el espejo cambió su respuesta:\n" +
                                "\n" +
                                "- No, mi Reina. La más hermosa es ahora Blancanieves.\n" +
                                "\n" +
                                "Al oír esto la Reina montó en cólera. La envidia la comía por dentro y tal era el odio que sentía por ella que acabó por ordenar a un cazador que la llevara al bosque, la matara y volviese con su corazón para saber que había cumplido con sus órdenes.";
                        //editText.getText().toString();
                ttsManager.initQueue(text);
            }
        });

        //La Sirenita
        hablarAhoraBoton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "El cuento de La sirenita comienza cuando En medio del mar, en las más grandes profundidades, se extendía un reino mágico, el reino del pueblo del mar. Un lugar de extraordinaria belleza rodeado por flores y plantas únicas y en el que se encontraba el castillo del rey del mar.\n" +
                        "\n" +
                        "Él y sus seis hijas vivían felices en medio de tanta belleza. Ellas pasaban el día jugando y cuidando de sus flores en los majestuosos jardines de árboles azules y rojos. La más pequeña de ellas, era la más especial. Su piel era blanca y suave, sus ojos grandes y azules, pero como el resto de las sirenas, tenía cola de pez. A la pequeña sirena le fascinaban las historias que su abuela contaba acerca de los seres humanos, tanto que cuando encontró una estatua de un hombre en los restos de un barco que naufragó no se lo pensó y se la llevó para ponerla en su jardín. La abuela les contó que algún día conocerían la superficie.\n" +
                        "\n" +
                        "- Cuando cumpláis quince años podréis subir a la superficie y podréis contemplar los bosques, las ciudades y todo lo que hay allí. Hasta entonces está prohibido.\n" +
                        "\n" +
                        "La pequeña sirena esperó a que llegara su turno ansiosa, imaginando como sería el mundo de allá arriba. Cada vez que a una de sus hermanas le llegaba el turno y cumplía los quince años, ella escuchaba atentamente las cosas que contaba y eso aumentaba sus ganas porque llegara el momento de subir.\n" +
                        "\n" +
                        "Tras años de espera por fin cumplió quince años. La sirena subió y se encontró con un gran barco en el que celebraban una fiesta. Oía música y alboroto y no pudo evitar acercarse para tratar de ver a través de una de sus ventanas. Entre la gente distinguió a un joven apuesto, que resultó ser el príncipe, y por quien quedó embelesada al observar su belleza.\n" +
                        "\n" +
                        "Continuó allí mirando hasta que una tormenta cayó sobre ellos repentinamente. El mar comenzó a rugir con fuerza y el barco empezó a dar tumbos como si se tratase de un barquito de papel, hasta que finalmente logró partirlo y mandarlo al fondo del mar. En medio del naufragio la Sirenita buscó al príncipe, logró rescatarlo y llevarlo sano y salvo hasta la playa. Estando allí oyó a unas muchachas que se acercaban, y rápidamente nadó hasta el mar por miedo a que la vieran. A lo lejos vio como su príncipe se despertaba y conseguía levantarse.\n" +
                        "\n" +
                        "La Sirenita siguió subiendo a la superficie todos los días con la esperanza de ver a su príncipe, pero nunca lo veía y cada vez regresaba más triste al fondo del mar. Pero un día se armó de valor y decidió visitar a la bruja del mar para que le ayudara a ser humana. Estaba tan enamorada que era capaz de pagar a cambio cualquier precio, por alto que fuera. Y vaya si lo fue.\n" +
                        "\n" +
                        "- Te prepararé tu brebaje y podrás tener dos piernecitas. Pero a cambio… ¡deberás pagar un precio!\n" +
                        "\n" +
                        "- Quiero tu don más preciado, ¡tu voz!\n" +
                        "\n" +
                        "- ¿Mi voz? Pero si no hablo, ¿cómo voy a enamorar al príncipe?\n" +
                        "\n" +
                        "- Tendrás que apañarte sin ella. Si no, no hay trato\n" +
                        "\n" +
                        "- Está bien\n" +
                        "\n" +
                        "La malvada bruja le advirtió que nunca más podría volver al mar y que si no conseguía enamorar al príncipe y éste contraía matrimonio con otra mujer, moriría y se convertiría en espuma de mar. La Sirenita estaba muy asustada pero a pesar de todo, aceptó el trato.\n" +
                        "\n" +
                        "La sirena se tomó la pócima y se despertó en la orilla de la playa al día siguiente. Su cola de sirena ya no estaba, en su lugar tenía dos piernas. El príncipe la encontró y le preguntó quién era y cómo había llegado hasta allí, la sirena intentó contestar pero recordó que había entregado su voz a la bruja. A pesar de esto la llevó hasta su castillo y dejó que se quedara allí. Entre los dos surgió una bonita amistad y cada vez pasaban más tiempo juntos.";
                //editText.getText().toString();
                ttsManager.initQueue(text);
            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ttsManager.shutDown();
    }

}
