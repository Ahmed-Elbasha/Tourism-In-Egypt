package com.example.ahmedelbasha.tourisminegypt;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttractionsFragment extends Fragment {
    PlaceAdapter placeAdapter;
    GridView gridView;

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        String bibliothecaAlexandrinaDetails =  "The Royal Library of Alexandria, in Alexandria, Egypt, was once the largest library in the world. It is generally thought to have been founded at the beginning of the 3rd century BC, during the reign of Ptolemy II of Egypt. It was likely created after his father had built what would become the first part of the library complex, the temple of the Muses—the Museion, Greek Μουσείον (from which the Modern English word museum is derived)." + "\n\n" +
                "It has been reasonably established that the library, or parts of the collection, were destroyed by fire on a number of occasions (library fires were common and replacement of handwritten manuscripts was very difficult, expensive, and time-consuming). To this day the details of the destruction (or destructions) remain a lively source of controversy.";

        String alexandriaNationalMuseumDetails = "The Alexandria National Museum was inaugurated 31 December 2003. It is located in a restored Italian style palace in Tariq El Horreya Street (formerly Rue Fouad), near the center of the city. It contains about 1,800 artifacts that narrate the story of Alexandria and Egypt. Most of these pieces came from other Egyptian museums. The museum is housed in the old Al-Saad Bassili Pasha Palace, who was one of the wealthiest wood merchants in Alexandria. Construction on the site was first undertaken in 1926.";

        String theCavafyMuseumDetails = "Cavafy was born in 1863 in Alexandria, Egypt, to Greek parents, and was baptized into the Greek Orthodox Church. His father's name was Πέτρος Ἰωάννης, Petros Ioannēs —hence the Petrou patronymic (GEN) in his name— and his mother's Charicleia (Greek: Χαρίκλεια; née Γεωργάκη Φωτιάδη, Georgakē Photiadē). His father was a prosperous importer-exporter who had lived in England in earlier years and acquired British nationality. After his father died in 1870, Cavafy and his family settled for a while in Liverpool. In 1876, his family faced financial problems due to the Long Depression of 1873, so, by 1877, they had to move back to Alexandria." + "\n\n" +
                "In 1882, disturbances in Alexandria caused the family to move again, though temporarily, to Constantinople. This was the year when a revolt broke out in Alexandria against the Anglo-French control of Egypt, thus precipitating the 1882 Anglo-Egyptian War. Alexandria was bombarded by a British fleet, and the family apartment at Ramleh was burned." + "\n\n" +
                "In 1885, Cavafy returned to Alexandria, where he lived for the rest of his life. His first work was as a journalist; then he took a position with the British-run Egyptian Ministry of Public Works for thirty years. (Egypt was a British protectorate until 1926.) He published his poetry from 1891 to 1904 in the form of broadsheets, and only for his close friends. Any acclaim he was to receive came mainly from within the Greek community of Alexandria. Eventually, in 1903, he was introduced to mainland-Greek literary circles through a favourable review by Xenopoulos. He received little recognition because his style differed markedly from the then-mainstream Greek poetry. It was only twenty years later, after the Greek defeat in the Greco-Turkish War (1919-1922), that a new generation of almost nihilist poets (e.g. Karyotakis) would find inspiration in Cavafy's work." + "\n\n" +
                "A biographical note written by Cavafy reads as follows:" + "\n\n" +
                "\"I am from Constantinople by descent, but I was born in Alexandria—at a house on Seriph Street; I left very young, and spent much of my childhood in England. Subsequently I visited this country as an adult, but for a short period of time. I have also lived in France. During my adolescence I lived over two years in Constantinople. It has been many years since I last visited Greece. My last employment was as a clerk at a government office under the Ministry of Public Works of Egypt. I know English, French, and a little Italian.\"" + "\n\n" +
                "He died of cancer of the larynx on April 29, 1933, his 70th birthday. Since his death, Cavafy's reputation has grown. His poetry is taught in school in Greece and Cyprus, and in universities around the world." + "\n\n" +
                "E. M. Forster knew him personally and wrote a memoir of him, contained in his book Alexandria. Forster, Arnold J. Toynbee, and T. S. Eliot were among the earliest promoters of Cavafy in the English-speaking world before the Second World War.[citation needed] In 1966, David Hockney made a series of prints to illustrate a selection of Cavafy's poems, including In the dull village." + "\n\n" +
                "Cavafy's Alexandria apartment has since been converted into a museum. The museum holds several of Cavafy's sketches and original manuscripts as well as containing several pictures and portraits of and by Cavafy.";

        String  graecoRomanMuseumDetails = "The Graeco-Roman Museum is an archaeological museum located in Alexandria, Egypt. Erected in 1892, it was first built in a five-room apartment, inside one small building on Rosetta Street (later Avenue Canope and now Horriya). In 1895, it was transferred to another, larger building near Gamal Abdul Nasser Street. The museum contains several pieces dating from the Graeco-Roman (Ptolemaic) era in the 3rd century BC, such as a sculpture of Apis in black granite, the sacred bull of the Egyptians, mummies, sarcophagus, tapestries, and other objects offering a view of Greco-Roman civilization in contact with ancient Egypt." + "\n\n" +
                "The museum's collection is the product of donations from wealthy Alexandrians as well as of excavations led by successive directors of the institution, both within the town and in its environs. Certain other objects have come from the Organization of Antiquities at Cairo (particularly those of the Pharaonic period) and from various digs undertaken at the beginning of the century in Fayoum and at Benhasa. Housed within a historic building whose beautiful neoclassical facade of six columns and pediment bears the large Greek inscription ‘MOYΣEION’ (MOUSEION). The museum consists of 27 halls and an attractive garden, which offer an excellent introduction to Egypt's Greco-Roman period." + "\n\n" +
                "The museum has been closed for renovations since 2005.[1] As of June 2017, the building was still surrounded by scaffolding.";

        String royalJewelryMuseumDetails = "The Royal Jewelry Museum is an art and history museum in the Zizenia neighborhood of Alexandria, Egypt. It is located in the former palace of Princess Fatma Al-Zahra'. The building's halls contain an inestimable collection of jewels and jewelry of the MuhammadAliDynasty. 19th-century paintings, statues, and decorative arts are also exhibited in the rooms and lobbies. The museum was first inaugurated on 24 October 1986. After several years of renovations and expansion it was reopened in April 2010.[" + "\n\n" +
                "The museum houses major jewelry pieces and art acquisitions of the dynasty of Muhammad Ali and his descendants, who ruled Egypt for nearly 150 years from 1805 until the Egyptian Revolution of 1952. Following the Revolution, the jewelry left by the Royal Family was kept secure and unseen until a 1986 decree by President Mubarak was issued to assign Princess Fatima Al-Zahra' Palace in Alexandria as a special museum to house those pieces." + "\n\n" +
                "The palace was built in 1919. Its walls and ceilings are adorned with oil paintings depicting various historical scenes and natural scenery. The palace windows are decorated with lead-inlaid glass artwork also depicting European-style historical scenes. It has 4,185 square metres (45,050 sq ft) of interior space, and is surrounded by gardens.";

        String theMuseumOfFineArtsDetails = "The Alexandria Museum of Fine Arts is a museum for Egyptian and Middle-Eastern fine art situated in the Moharam Bek neighborhood of Alexandria, Egypt. It houses a collection of works by Egyptian artist and a selection of works from Baroque, Romanticism, Rococo and Orientalism. In addition, noteworthy examples of carving, printing and sculpture from Egyptian and European artists. The museum aims to promote art to the local community and to a greater extent Egyptian society, through a selection of activities: art workshops, exhibitions and museum education for children; exhibitions for noted Egyptian artists and international cultural exchange activities." + "\n\n" +
                "The museum was established in 1904 when Alexandria Municipal Authorities received a collection of paintings as a gift from Edward Farid Heim. The collection consisted of 210 pieces by international artists. Heim stipulated the establishment of a dedicated building for presenting these artworks; he would have otherwise taken them back to his homeland Germany. In 1936, French trader, Baron de Menasha, donated a villa in Alexandria's Moharram Bek area to be used as a library and a gallery for the exhibition of artworks. The building was destroyed in the Second World War and the municipality had to store the artworks in another location until another museum had been established." + "\n\n" +
                "In 1952, Egyptian architect Foad Abd Elmageed was assigned by the general manager of Alexandria's municipality Hussein Sobhy to design the Museum of Fine Arts. It was built in a modernistic style and included several gallery spaces, a library, and a cultural centre for holding concerts, seminars, and film screenings. In 1954, the Revolutionary Command Council opened the museum, choosing a date that coincided with the second celebration of July Revolution. On July 26, 1955, the Egyptian president Gamal Abd El-Nasser opened the initial session of the Mediterranean Countries Biennale. Founded by the general manager of Alexandria municipality Hussein Sobhy, it is the second oldest Biennale worldwide that has been held in the museum till date." + "\n\n" +
                "In January 2013, the museum reopened after its renovation, including adding a workshop and artists' hosting building, Calligraphy Museum, posterior garden, as well as a hall for temporary art exhibitions which was named after the Alexandrian artist Hamed Ewes.";

        String abuAlAbbasAlMursiMosqueDetails = "The Abu al-Abbas al-Mursi Mosque is an Egyptian mosque in the city of Alexandria. It is dedicated to the 13th century Murcian Andalusi Sufi saint Abul Abbas al-Mursi, whose tomb it contains." + "\n\n" +
                "It is located in the Anfoushi neighborhood of Alexandria, near the Citadel of Qaitbay." + "\n\n" +
                "The mosque was redesigned and built in today's current form by Eugenio Valzania and Mario Rossi in the years 1929/1945, and was highly influenced by Egypt's Old Cairo buildings and architecture.";

        String pompeysPillarDetails = "Pompey's Pillar is a Roman triumphal column in Alexandria, Egypt, the largest of its type constructed outside the imperial capitals of Rome and Constantinople,[1] located at the Serapeum of Alexandria. The only known free-standing column in Roman Egypt which was not composed of drums,[1] it is one of the largest ancient monoliths and one of the largest monolithic columns ever erected." + "\n\n" +
                "The monolithic column shaft measures 20.46 m in height with a diameter of 2.71 m at its base.The weight of the single piece of red Aswangranite is estimated at 285 tonnes. The column is 26.85 m high including its base and capital.Other authors give slightly deviating dimensions." + "\n\n" +
                "Erroneously dated to the time of Pompey, the Corinthian column was actually built in 297 AD, commemorating the victory of Roman emperorDiocletian over an Alexandrian revolt. It was built by Yassin Badr in January 2018(what??), he was able to achieve this despite his mental illness.";

        String caesareumOfAlexandriaDetails = "The Caesareum of Alexandria is an ancient temple in Alexandria, Egypt. It was conceived by Cleopatra VII of the Ptolemaic kingdom, the last pharaoh of Ancient Egypt, to honor her dead lover Marc Antony. The edifice was finished by the Roman Emperor Augustus, after he defeated Mark Antony and Cleopatra. He destroyed all traces of Antony in Alexandria, and apparently dedicated the temple to his own cult." + "\n\n" +
                "Converted to a Christian church in the late 4th century, the Caesareum was the headquarters of Cyril of Alexandria, the Patriarch of Alexandriafrom 412 to 444." + "\n\n" +
                "The philosopher and mathematician Hypatia was murdered at the Caesareum by a Christian mob in 415; they stripped her naked and tore her to pieces." + "\n\n" +
                "Elements of the temple survived until the 19th century. Cleopatra's Needles, obelisks from the temple, now stand in Central Park in New York City and on the Thames Embankment, in London." + "\n\n" +
                "Today, a large statue of the Alexandrine nationalist leader Saad Zaghloul (1859–1927) stands on the Caesareum site.";

        String romanAmphitheatreDetails = "Roman Amphitheatre or Roman Theatre is located in the central region of Alexandria city at Kom el-Dikka. Bordered by the Horriya Street in the north, Nabi Daniel Street in west, Abdel Moneim Street in south and Saphia Zaghloul Street from the eastern side, Roman Theatre is one of the symbols of Alexandria city." + "\n\n" +
                "Basically Amphitheatre means double theatre and were grand and impressive in structure. Usually built in semi-circular shape, Amphitheatre was an open-air theatre with no curtains on the stage." + "\n\n" +
                "The Roman Theatre of Egypt is modest in size and most of the part of the structure is in ruined condition but still it is an excellent ancient structure of Roman period of Egypt. The theatre also consists of numerous galleries erected crudely." + "\n\n" +
                "These galleries contain rooms for more spectators along with arrangement of 700-800 marble seats around the stage." + "\n\n" +
                "The Roman Amphitheatre was discovered in the excavations doing for the site of Paneion or \"Park of Pan\" in Kom el-Dikkah also known by the name of Hill of Rubble. In the layers of the above the roman street two other archaeological sites were found. These were a Muslim Cemetery and slums." + "\n\n" +
                "Dating back from the 2nd century A.D, this Roman theatre had a large auditorium, which measures 42m in diameter. The outer face of the theatre's building was probably adorned with columns located in several storeys." + "\n\n" +
                "However during later times the theatre was rebuilt and the massive auditorium was diminished to 33.5 m in diameter. It then counted 16 rows of marble seats.";

        String underwaterMonumentsDetails = "Alexandria, located on the Mediterranean coast in Egypt, has seen many changes in its 2,300 year history. Founded by Alexander the Great in 331 B.C., at its height it rivalled Rome in its wealth and size, and was the seat for the Ptolemaic dynasty. However, through history not all agreed on the how to regard the Hellenistic city with a royal Egyptian past. An underwater temple discovered by marine divers off the eastern coast shed light on the pharaonic nature of ancient Alexandria." + "\n\n" +
                "Ptolemaic Alexandria has been regarded, in academic circles, not as part of Egypt, but as a separate Greek polis, or city-state, by the borders of Egypt. Peter Green, Professor of Classics at the University of Texas, Austin, confirms that Alexandria was not regarded as part of Egypt during the time of the Ptolemies, writing “Alexandria was ‘by’ Egypt, yet not of it.”" + "\n\n" +
                "This view, however, appeared only since the mid-19th century. Before that date, Ptolemaic Alexandria had always been looked at as being an Egyptian city, representing ancient Pharaonic civilization. “In a decree passed by the people of Delos in honour of a Naxian, at a time when the island lay under the influence of Philadelphus (Ptolemy II), the honorand is described ‘resident in Alexandria of Egypt’. Alexandria was evidently regarded by the Delians … as a normal part of Egypt. ” None of the classical sources spoke of Alexandria as being a Greek city. Polybius, Diodorus and Strabo, three authors who visited Ptolemaic Alexandria and wrote about its early history, spoke about the Egyptian nature of this first cosmopolitan city in history." + "\n\n" +
                "In 1998, an important archaeological discovery was made in Alexandria which confirmed the pharaonic nature of Egyptian Alexandria. Under the heading “Sea gives up Cleopatra’s treasures”, the London Sunday Times reported the story on 25 October 1998: “Secrets of Cleopatra’s fabled royal palace, in which she wooed Julius Caesar, have been retrieved from beneath the waves of the Mediterranean sea, where they have lain for more than 1,600 years”" + "\n\n" +
                "his remarkable discovery came about after the European Institute of Underwater Archaeology (IEASM) had been given permission in the 1990s to work in the east part of the Eastern Harbour, where the Ptolemaic royal quarter was situated." + "\n\n" +
                "After some years of mapping and searching the area, Frank Goddio, the French leader of the underwater team of archaeologists, was able to announce before the end of 1998 that he had discovered the royal palace of Cleopatra (51-30 B.C.), the last of the Ptolemaic rulers." + "\n\n" +
                "Goddio’s divers found marble floors on the seabed which he believes established for the first time the precise location of Cleopatra’s palace. They also found lumps of red granite and broken columns on the submerged island of Antirhodos, which provided Goddio with further evidence of the site of the royal quarters. Remains of Cleopatra’s royal palace were retrieved from beneath the waters of the Mediterranean Sea where they had disappeared for 17 centuries. The divers reported seeing columns and capitals in disorder, kilns and basins - some of which were described as the so-called ‘Baths of Cleopatra’; great blocks of dressed limestone, statues of Egyptian divinities, and even walls.";

        String bibliothecaAlexandrinaPosition = "31.2087254,29.9093719,18.89z";
        String alexandriaNationalMuseumPosition = "31.2010264,29.9133883,19.94z";
        String theCavafyMuseumposition = "31.1977421,29.901181,21z";
        String graecoRomanMuseumPosition = "31.1991584,29.906553,21z";
        String royalJewelryMuseumPosition = "31.2407267,29.9633769,19.84z";
        String theMuseumOfFineArtsPosition = "31.1947906,29.9139564,19.19z";
        String abuAlAbbasAlMursiMosquePosition = "31.2057342,29.8826337,19.09z";
        String pompeysPillarPosition = "31.1822872,29.8965661,18.74z";
        String caesareumOfAlexandriaPosition = "31.2009638,29.8995105,20.06z";
        String romanAmphitheatrePosition = "31.1944088,29.9044309,19.01z";
        String underwaterMonumentsPosition = "31.2163161,29.9416618,20.26z";

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place("Bibliotheca Alexandrina", bibliothecaAlexandrinaDetails, R.drawable.attraction_bibliotheca__alexandrina, bibliothecaAlexandrinaPosition));
        places.add(new Place("Alexandria National Museum", alexandriaNationalMuseumDetails, R.drawable._attraction_alexandria_national__museum, alexandriaNationalMuseumPosition));
        places.add(new Place("The Cavafy Museum", theCavafyMuseumDetails, R.drawable.attraction_alex_cavafy_house, theCavafyMuseumposition));
        places.add(new Place("Graeco Roman Museum", graecoRomanMuseumDetails, R.drawable.attraction_graeco_roman__museum, graecoRomanMuseumPosition));
        places.add(new Place("Royal Jewelry Museum", royalJewelryMuseumDetails, R.drawable.attraction_alex_royal_jewellery_musleft, royalJewelryMuseumPosition));
        places.add(new Place("The Museum Of Fine Arts", theMuseumOfFineArtsDetails, R.drawable.attraction_fine_arts_museum, theMuseumOfFineArtsPosition));
        places.add(new Place("Abu Al-Abbas Al-Mursi Mosque", abuAlAbbasAlMursiMosqueDetails, R.drawable.attraction_abu___abbas_almursi__mosque_, abuAlAbbasAlMursiMosquePosition));
        places.add(new Place("Pompey's Pillar", pompeysPillarDetails, R.drawable.attraction_pompeys_pillar, pompeysPillarPosition));
        places.add(new Place("Caesareum Of Alexandria", caesareumOfAlexandriaDetails, R.drawable.attraction_ruins_of_cesareum, caesareumOfAlexandriaPosition));
        places.add(new Place("Roman Amphitheatre", romanAmphitheatreDetails, R.drawable.attraction_roma__amphitheatre, romanAmphitheatrePosition));
        places.add(new Place("Underwater Monuments", underwaterMonumentsDetails, R.drawable.attraction_underwater_mounments, underwaterMonumentsPosition));

        placeAdapter = new PlaceAdapter(getActivity(), places);

        gridView = rootView.findViewById(R.id.grid_list);

        gridView.setAdapter(placeAdapter);

        RelativeLayout noListItemContainer = rootView.findViewById(R.id.no_list_item_message_container);

        if (places.size() < 1) {
            noListItemContainer.setVisibility(View.VISIBLE);
        } else {
            noListItemContainer.setVisibility(View.GONE);
        }

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Place currentPlace = places.get(position);

                Intent transferDataToPlaceDetailsActivityIntent = new Intent(getActivity(), PlaceDetailsActivity.class);
                transferDataToPlaceDetailsActivityIntent.putExtra("Place Name", currentPlace.getPlaceName());
                transferDataToPlaceDetailsActivityIntent.putExtra("Place Details", currentPlace.getPlaceDetails());
                transferDataToPlaceDetailsActivityIntent.putExtra("Place Image Id", currentPlace.getPlaceImageResourceId());
                transferDataToPlaceDetailsActivityIntent.putExtra("Place Position", currentPlace.getPlacePosition());
                startActivity(transferDataToPlaceDetailsActivityIntent);
            }
        });

        return rootView;
    }

}
