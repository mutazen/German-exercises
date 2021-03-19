package com.example.pruebasaleman;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.Random;

public class MyDataBase extends SQLiteOpenHelper {

    private static final String COMMENT_TABLE_CREATE = "CREATE TABLE sustantivo(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "sustantivo TEXT, articulo TEXT, plural TEXT, significado TEXT)";
    private static final String DB_NAME = "comments.sqlite";
    private static final int DB_VERSION = 1;
    private final SQLiteDatabase db;

    public MyDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db=this.getWritableDatabase();
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(COMMENT_TABLE_CREATE);
        db.execSQL("Insert into sustantivo (sustantivo, articulo, plural, significado) values " +
                "('Batterie', 'die', 'Batterien', 'pila')," +
                "('Begrüßung', 'die', 'Begrüßung', 'saludo')," +
                "('Blume', 'die', 'Blumen', 'flor')," +
                "('Cousine', 'die', 'Cousinen', 'primo')," +
                "('Einwohnerin', 'die', 'Einwohnerinnen', 'habitante')," +
                "('Eltern', 'die', 'Eltern', 'padres')," +
                "('Entschuldigung', 'die', 'Entschuldigungen', 'disculpa')," +
                "('Familie', 'die', 'Familien', 'familia')," +
                "('Farbe', 'die', 'Farben', 'color')," +
                "('Frau', 'die', 'Frauen', 'señora, mujer')," +
                "('Geldbörse', 'die', 'Geldbörsen', 'cartera')," +
                "('Geschwister', 'die', 'Geschwister', 'hermanos')," +
                "('Gesundheit', 'die', 'Gesundheit', 'salud')," +
                "('Glühbirne', 'die', 'Glühbirnen', 'bombilla')," +
                "('Großeltern', 'die', 'Großeltern', 'abuelo')," +
                "('Haupstadt', 'die', 'Haupstädte', 'ciudad principal')," +
                "('Haus', 'die', 'Häuser', 'casa')," +
                "('Jacke', 'die', 'Jacken', 'chaqueta')," +
                "('Kamera', 'die', 'Kameras', 'cámara')," +
                "('Karte', 'die', 'Karten', 'naipe')," +
                "('Kette', 'die', 'Ketten', 'cadena')," +
                "('Lage', 'die', 'Lagen', 'sitio')," +
                "('Linke', 'die', 'Linken', 'izquierda')," +
                "('Mine', 'die', 'Minen', 'mina de lápiz')," +
                "('Mutter', 'die', 'Mütter', 'madre')," +
                "('Nacht', 'die', 'Nächte', 'noche')," +
                "('Nichte', 'die', 'Nichten', 'sobrina')," +
                "('Oma', 'die', 'Omas', 'abuela')," +
                "('Party', 'die', 'Partys', 'fiesta')," +
                "('Postkarte', 'die', 'Postkarten', 'postal')," +
                "('Puppe', 'die', 'Puppen', 'muñeca')," +
                "('Reise', 'die', 'Reisen', 'viaje')," +
                "('Rechte', 'die', 'Rechten', 'derecha')," +
                "('Schule', 'die', 'Schulen', 'escuela')," +
                "('Schwester', 'die', 'Schwestern', 'hermana')," +
                "('Steckdose', 'die', 'Steckdosen', 'enchufe')," +
                "('Straße', 'die', 'Straßen', 'calle')," +
                "('Tante', 'die', 'Tanten', 'tia')," +
                "('Tasche', 'die', 'Taschen', 'bolso')," +
                "('Taschenlampe', 'die', 'Taschenlampen', 'linterna')," +
                "('Tasse', 'die', 'Tassen', 'taza')," +
                "('Tür', 'die', 'Türen', 'puerta')," +
                "('Uhr', 'die', 'Uhren', 'hora, reloj')," +
                "('Verabschiedung', 'die', 'Verabschiedungen', 'despedida')," +
                "('Woche', 'die', 'Wochen', 'semana')," +
                "('Ausstellung', 'die', 'Austellungen', 'exposición')," +
                "('Disco', 'die', 'Discos', 'discoteca')," +
                "('Kneipe', 'die', 'Kneipen', 'bar (cafetería)')," +
                "('Bar', 'die', 'Bars', 'bar (de copas)')," +
                "('Woche', 'die', 'Wochen', 'semana')," +
                "('Alter', 'das', 'Alter', 'edad')," +
                "('Autp', 'das', 'Autos', 'coche')," +
                "('Buch', 'das', 'Bücher', 'libro')," +
                "('Fenster', 'das', 'Fenster', 'ventana')," +
                "('Geld', 'das', 'Geld', 'dinero')," +
                "('Handy', 'das', 'Handys', 'móvil')," +
                "('Haustier', 'das', 'Haustiere', 'mascota')," +
                "('Jahr', 'das', 'Jahre', 'año')," +
                "('Kino', 'das', 'Kinos', 'cine')," +
                "('Papier', 'das', 'Papiere', 'papel')," +
                "('Radio', 'das', 'Radios', 'radio')," +
                "('Spanisch', 'das', 'Spanisch', 'español (idioma)')," +
                "('Theater', 'das', 'Theather', 'teatro')," +
                "('Waschbecken', 'das', 'Waschbecken', 'lavabo')," +
                "('Wochenende', 'das', 'Wochenenden', 'fin de semana')," +
                "('Zimmer', 'das', 'Zimmers', 'habitación')," +
                "('Bierglas', 'das', 'Bierglases', 'vaso de cerveza')," +
                "('T-Shirt', 'das', 'T-Shirts', 'camiseta')," +
                "('Feurzeug', 'das', 'Feurzeuge', 'encendedor')," +
                "('Handtuch', 'das', 'HAndtuche', 'toalla')," +
                "('Museum', 'das', 'Museen', 'museo')," +
                "('Café', 'das', 'Cafés', 'café (local)')," +
                "('Schwimmbad', 'das', 'Schwimmbäder', 'piscina')," +
                "('Konzert', 'das', 'Konzerte', 'concierto')," +
                "('Restaurant', 'das', 'Restaurants', 'restaurante')," +
                "('Beruf', 'der', 'Berufe', 'profesión')," +
                "('Bleistift', 'der', 'Bleistifte', 'lápiz')," +
                "('Bruder', 'der', 'Bruders', 'hermano')," +
                "('Cousin', 'der', 'Cousins', 'primo')," +
                "('Dienstag', 'der', 'Dienstage', 'martes')," +
                "('Donnerstag', 'der', 'Donnerstage', 'miércoles')," +
                "('Einwohner', 'der', 'Einwohner', 'habitante (masculino)')," +
                "('Elektroherd', 'der', 'Elektroherde', 'cocinilla electrica')," +
                "('Euro', 'der', 'Euros', 'euro')," +
                "('Familienname', 'der', 'Familiennamen', 'apellido')," +
                "('Fotoapparat', 'der', 'Fotoapparate', 'cámara')," +
                "('Freitag', 'der', 'Freitage', 'viernes')," +
                "('Fußball', 'der', 'Fußbälle', 'restaurante')," +
                "('Gast', 'der', 'Gäste', 'cliente')," +
                "('Herr', 'der', 'Herren', 'señor')," +
                "('Kaffee', 'der', 'Kaffees', 'café')," +
                "('König', 'der', 'Könige', 'rey')," +
                "('Kuchen', 'der', 'Kuchen', 'tarta')," +
                "('Kugelschreiber', 'der', 'Kugelschreiber', 'bolígrafo')," +
                "('Kunststoff', 'der', 'Kunststoffe', 'plástico')," +
                "('Mann', 'der', 'Männer', 'hombre')," +
                "('Markt', 'der', 'Märkte', 'mercado')," +
                "('Mittwoch', 'der', 'Mittwoche', 'miércoles')," +
                "('Montag', 'der', 'Montage', 'lunes')," +
                "('Nachname', 'der', 'Nachnamen', 'nombre')," +
                "('Neffe', 'der', 'Neffen', 'sobrino')," +
                "('Onkel', 'der', 'Onkel', 'tio')," +
                "('Opa', 'der', 'Opas', 'abuelo')," +
                "('Park', 'der', 'Parks', 'parque')," +
                "('Punkt', 'der', 'Punkte', 'punto')," +
                "('Regenschirm', 'der', 'Regenschirme', 'paraguas (de mano)')," +
                "('Ring', 'der', 'Ringe', 'anillo')," +
                "('Samstag', 'der', 'Samstage', 'sábado')," +
                "('Schlüsselanhänger', 'der', 'Schlüsselanhänger', 'llavero')," +
                "('Sonntag', 'der', 'Sonntage', 'domingo')," +
                "('Stecker', 'der', 'Stecker', 'enchufe')," +
                "('Strand', 'der', 'Strände', 'playa')," +
                "('Stuhl', 'der', 'Stühle', 'silla')," +
                "('Tag', 'der', 'Tage', 'dia')," +
                "('Taschenrechner', 'der', 'Taschenrechter', 'calculadora')," +
                "('Teller', 'der', 'Teller', 'plato')," +
                "('Tisch', 'der', 'Tische', 'mesa')," +
                "('Vater', 'der', 'Väter', 'padre')," +
                "('Wasserhahn', 'der', 'Wasserhähne', 'grifo')," +
                "('Morgen', 'der', 'Morgens', 'mañana')," +
                "('Vormittag', 'der', 'Vormittage', 'mediodía (después de las 12)')," +
                "('Mittag', 'der', 'Mittage', 'mediodía (Las doce)')," +
                "('Nachmittag', 'der', 'Nachmittage', 'mediodía (antes de las 12))')," +
                "('Abend', 'der', 'Abends', 'tarde')," +
                "('Tomate', 'die', 'Tomaten', 'tomate')," +
                "('Salat', 'der', 'Salate', 'lechuga')," +
                "('Wohnort', 'der', 'Wohnorte', 'domicilio')," +
                "('Käse', 'der', 'Käse', 'queso')," +
                "('Schinken', 'der', 'Schinken', 'jamón')," +
                "('Apfel', 'der', 'Äpfel', 'manzana')," +
                "('Tee', 'der', 'Tees', 'té')," +
                "('Braten', 'der','Braten', 'asado')," +
                "('Brot', 'das', 'Brote', 'pan')," +
                "('Orange', 'die', 'Orangen', 'naranja')," +
                "('Milch', 'die', 'Milch', 'leche')," +
                "('Butter', 'die', 'Butter', 'mantequilla')," +
                "('Fisch', 'der', 'Fische', 'pescado')," +
                "('Kartoffel', 'die', 'Kartoffeln', 'papa')," +
                "('Schokolade', 'die', 'Schokoladen', 'chocolate')," +
                "('Suppe', 'die', 'Suppen', 'sopa')," +
                "('Luste', 'die', 'Lüste', 'deseo')," +
                "('Tasse', 'die', 'Tassen', 'taza')," +
                "('Untertasse', 'die', 'Untertassen', 'platillo (taza)')," +
                "('Glas', 'das', 'Gläser', 'vaso')," +
                "('Brille', 'die', 'Brillen', 'gafas')," +
                "('Kanne', 'die', 'Kannen', 'jarra')," +
                "('Ei', 'das', 'Eier', 'huevo')," +
                "('Salz', 'das', 'Salze', 'sal')," +
                "('Pfeffer', 'der', 'Pfeffer', 'pimienta')," +
                "('Zucker', 'der', 'Zucker', 'azúcar')," +
                "('Wein', 'der', 'Weine', 'vino')," +
                "('Bier', 'das', 'Biere', 'cerveza')," +
                "('Essig', 'der', 'Essige', 'vinagre')," +
                "('Hähnchen', 'das', 'Hähnchen', 'pollo')," +
                "('Würstchen', 'das', 'Würstchen', 'salchicha')," +
                "('Spaguetti', 'die', 'Spaguetti', 'espagueti')," +
                "('Sauce', 'die', 'Saucen', 'salsa')," +
                "('Birne', 'die', 'Birnen', 'pera')," +
                "('Apfelsine', 'die', 'Apfelsinen', 'naranja')," +
                "('Zwiebel', 'die', 'Zwiebeln', 'cebolla')," +
                "('Kotelett', 'der', 'Koteletts', 'chuleta')," +
                "('Wurst', 'die', 'Würste', 'embutido')," +
                "('Joghurt', 'der', 'Joghurt', 'yogúr')," +
                "('Gabel', 'die', 'Gabeln', 'tenedor')," +
                "('Tischtuch', 'das', 'Tischtücher', 'mantel')," +
                "('Häferl', 'das', 'Häferln', 'taza')," +
                "('Serviette', 'die', 'Servietten', 'servilleta')");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public SubstantiveData getRandomWord(){

        SubstantiveData substantiveData = new SubstantiveData();
        int idRandom= idRandom();
        Cursor c = db.rawQuery("Select * from sustantivo where _id = " + idRandom, null);

        if (c != null && c.getCount()>0) {
            c.moveToFirst();

            substantiveData.setWord(c.getString(c.getColumnIndex("sustantivo")));
            substantiveData.setWordGender(c.getString(c.getColumnIndex("articulo")));
            substantiveData.setPluralWord(c.getString(c.getColumnIndex("plural")));
            substantiveData.setTranslation(c.getString(c.getColumnIndex("significado")));
        }

        if (c != null) {
            c.close();
        }
        return substantiveData;

    }

    public int idRandom() {
        int numRow = (int) DatabaseUtils.queryNumEntries(db, "sustantivo");
        return new Random().nextInt(numRow + 1);
    }

}
