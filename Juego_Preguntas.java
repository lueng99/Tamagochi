import java.util.*;
//Para que todas las cosas se importen.

public class Juego_Preguntas {
    public static int play() {

        String[] preguntasJuego = {

                "¿Cuál es el lema de la Casa Stark? \n",
                "¿Quién mata al Rey de la Noche? \n",
                "¿Quién ayuda a Daenerys a salir de la Casa de los Eternos? \n",
                "¿Cuál es la primera identidad que usa Arya con el poder de los Hombres sin Rostro? \n",
                "¿A quién mata Arya en la Batalla de Invernalia? \n",
                "¿Cómo se disfraza Arya para escapar de Desembarco del Rey? \n",
                "¿Cómo se llama la loba huargo de Arya? \n",
                "¿Qué frase le enseña Arya a decir a sí misma para mantener el coraje? \n",
                "¿A qué organización se une Arya en Braavos? \n",
                "¿Quién le enseña a Arya a sobrevivir en el camino después de la muerte de su padre? \n",
                "¿A quién mata Arya como venganza por la Boda Roja? \n",
                "¿Cuál es el último dragón de Daenerys que queda vivo? \n",
                "¿Como se le conoce a Daenerys? \n",
                "¿En qué ciudad Daenerys libera a los Inmaculados? \n",
                "¿Quién traiciona a Daenerys en Meereen? \n",
                "¿A quién crucifica Daenerys en Meereen como represalia? \n",
                "¿Cuál es el idioma nativo de Daenerys? \n",
                "¿Quién le regala los huevos de dragón a Daenerys? \n",
                "¿Qué objeto usa Daenerys para eclosionar sus dragones? \n",
                "¿Quién es la verdadera madre de Jon Snow? \n",
                "¿Quién traiciona y apuñala a Jon Snow en el Castillo Negro? \n",
                "¿Quién revive a Jon Snow después de su muerte? \n",
                "¿Cuál es el verdadero nombre de Jon Snow? \n",
                "¿Quién es el líder de los Salvajes que se convierte en aliado de Jon? \n",
                "¿Cómo se llama el castillo principal de la Guardia de la Noche? \n",
                "¿Quién le revela a Jon Snow su verdadera identidad? \n",
                "¿Quién es el mejor amigo de Jon en la Guardia de la Noche? \n",
                "¿Cuál es el lema de la Casa Targaryen? \n",

        };

        String[][] respuestas = {

                {"a) Fuego y Sangre \nb) Un Lannister siempre paga sus deudas \nc) Nuestra es la Furia \nd) Se Acerca el Invierno "}, //3
                {"a) Jon Nieve \nb) Daenerys Targaryen \nc) Arya Stark \nd) Bran Stark "}, //2
                {"a) Ser Jorah Mormont \nb) Drogon \nc) Missandei \nd) Barristan Selmy "}, //0
                {"a) Una anciana \nb) Una niña mendiga \nc) Una criada \nd) Un mercader "}, //1
                {"a) El Rey de la Noche \nb) El Perro \nc) Viserion \nd) Beric Dondarrio "}, //0
                {"a) Como un soldado \nb) Como una criada \nc) Como un chico común \nd) Como un mercenario "}, //2
                {"a) Nymeria \nb) Verano \nc) Dama \nd) Fantasma "}, //0
                {"a) Soy una Stark de Invernalia \nb) El norte recuerda \nc) El miedo hiere más que las espadas \nd) Que empiece el juego "}, //2
                {"a) La Compañía Dorada \nb) Los Hombres sin Rostro \nc) La Hermandad sin Estandartes \nd) La Guardia de la Noche "}, //1
                {"a) Sandor Clegane \nb) Tyrion Lannister \nc) Jorah Mormont \nd) Brienne de Tarth "}, //0
                {"a) Roose Bolton \nb) La casa Frey \nc) Ramsay Bolton \nd) Tywin Lannister "}, //1
                {"a) Drogon \nb) Viserion \nc) Rhaegal \nd) Balerion "}, //0
                {"a) Reina del Norte \nb) Madre de Dragones \nc) Rompedora de Cadenas \nd) Khaleesi "}, //1
                {"a) Meereen \nb) Yunkai \nc) Astapor \nd) Volantis "}, //0
                {"a) Ser Barristan Selmy \nb) Missandei \nc) Hizdahr zo Loraq \nd) Los Hijos de la Arpía "}, //3
                {"a) A los esclavistas \nb) A los Inmaculados \nc) A los consejeros \nd) A los Hijos de la Arpía "}, //0
                {"a) Valyrio \nb) Alto Valyrio \nc) Dothraki \nd) Lengua Común "}, //1
                {"a) Viserys Targaryen \nb) Illyrio Mopatis \nc) Khal Drogo \nd) Jorah Mormont "}, //1
                {"a) Una hoguera \nb) Un ritual de sangre \nc) Magia de los Eternos \nd) Un volcán "}, //0
                {"a) Catelyn Stark \nb) Lyanna Stark \nc) Ashara Dayne \nd) Elia Martell "}, //1
                {"a) Alliser Thorne \nb) Tormund Giantsbane \nc) Samwell Tarly \nd) Qhorin Mediamano "}, //0
                {"a) Thoros de Myr \nb) Melisandre \nc) Beric Dondarrion \nd) Bran Stark "}, //1
                {"a) Aegon Targaryen \nb) Rhaegar Targaryen \nc) Jon Stark \nd) Eddard Targaryen "}, //0
                {"a) Rattleshirt \nb) Mance Rayder \nc) Craster \nd) Tormund Giantsbane "}, //3
                {"a) Guardiaoriente del Mar \nb) Castillo Negro \nc) Torre Sombría \nd) Invernalia "}, //1
                {"a) Tyrion Lannister \nb) Daenerys Targaryen \nc) Samwell Tarly y Bran Stark \nd) Varys "}, //2
                {"a) Edd el Penas \nb) Pyp \nc) Grenn \nd) Samwell Tarly "}, //3
                {"a) Se acerca el invierno \nb) Nuestra es la Furia \nc) Fuego y Sangre \nd) Escucha mi Rugido "}, //2


        };

        //Son las respuestas correctas según índices

        int[] respuestasCorrectas = {3, 2, 0, 1, 0, 2, 0, 2, 1, 0, 1, 0, 1, 0, 3, 0, 1, 1, 0, 1, 0, 1, 0, 3, 1, 2, 3, 2};

        int contador = 0; //Por cada respuesta correcta se suma 1
        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> aleatorios = new ArrayList<>();
        for (int i = 0; i < preguntasJuego.length; i++) {
            aleatorios.add(i); //Agrega las preguntas.
        }

        Collections.shuffle(aleatorios); //Para mezclar las preguntas.

        for (int i = 0; i < 10; i++) { //Selecciona 10 preguntas aleatorias de las 30 aleatoriamente
            int Indicepregunta = aleatorios.get(i);
            System.out.println(preguntasJuego[Indicepregunta]);
            for (String opcion : respuestas[Indicepregunta]) {
                System.out.println(opcion);
            }

            System.out.println("Elige una respuesta (a,b,c,d): ");
            String respuesta = teclado.nextLine().toLowerCase(); //Leer respuesta usuario

            //Convertir respuesta en un índice

            int indiceRespuestas = -1;

            if (respuesta.equals("a")) {
                indiceRespuestas = 0;
            } else if (respuesta.equals("b")) {
                indiceRespuestas = 1;
            } else if (respuesta.equals("c")) {
                indiceRespuestas = 2;
            } else if (respuesta.equals("d")) {
                indiceRespuestas = 3;
            }

            //Para saber si la respuesta es correcta o no.

            if (indiceRespuestas == respuestasCorrectas[Indicepregunta]) {

                System.out.println("Respuesta correcta");
                contador++;
            } else {
                System.out.println("Respuesta incorrecta");
            }

        }
        //Si has ganado o perdido -> Si ganas tu estado de ánimo sube 3 puntos.
        //                        -> Si pierdes tu estado de ánimo baja -3 puntos.


        String toString;
        {
            String mostrar;
            mostrar = "Has acertado: " + contador + " de 10 preguntas";
        }
        return contador;

    }



}
