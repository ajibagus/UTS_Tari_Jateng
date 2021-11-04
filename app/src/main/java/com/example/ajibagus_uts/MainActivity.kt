package com.example.ajibagus_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Tarian Jawa Tengah"
        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.gambyong,"Tari Gambyong","Surakarta",
            "Tarian tradisional Jawa Tengah yang pertama adalah Tari Gambyong. Awal mulanya mulai populer dari Surakarta." +
                "Tidak banyak yang tahu bahwa asal mula tarian tradisional Jawa Tengah ini adalah tarian rakyat. " +
                "Tarian gambyong pada umumnya dibawakan pada saat tanam padi dan musim panen sebagai penghormatan kepada Dewi Sri. " +
                "Tarian tradisional ini biasanya dibawakan oleh dua remaja putri yang mengenakan kostum berwarna hijau. " +
                    "Kostum ini dipadukan dengan bawahan kain batik, selendang kuning panjang yang dililitkan di pinggang, dan hiasan kepala. " +
                    "Para penari diiringi lagu khas budaya Jawa dan dibawakan oleh sinden (penyanyi) dan lantunan gamelan (alat musik tradisional Jawa). " +
                    "Gerakan tarian tradisional Jawa Tengah ini cukup lincah, dan berbaris rapi menghadap penonton di panggung."))

        data?.add(DataModel(R.drawable.golek,"Tari Golek","Yogyakarta",
            "Selain itu, tarian tradisional Jawa Tengah lainnya adalah tari Golek. " +
                    "Ini adalah jenis tari tunggal yang dibudidayakan di keraton dan diperagakan untuk acara-acara kebudayaan tertentu. " +
                    "Tarian solo yang menggambarkan seorang gadis muda yang tumbuh menjadi wanita dewasa. " +
                    "Posisi dan teknik dasarnya menyerupai tarian Bedhaya dan Serimpi, tetapi gerakan deskriptifnya menggambarkan kecantikan diri seorang gadis. " +
                    "Nama Golek mengacu pada wayang Golek, dan aliran ini memiliki kesejajaran dalam khasanah sejarah wayang Golek. " +
                    "Tari Golek secara tradisional dipertunjukkan untuk resepsi pernikahan yang meriah. "))

        data?.add(DataModel(R.drawable.bedhaya,"Tari Bedhaya","Kasunanan Surakarta",
            "Bedhaya memiliki makna religius yang dalam bagi penampil dan penontonnya. " +
                    "Prinsip estetikanya terkait dengan konsep non-verbal tentang keindahan dan kekuatan, dan tarian Bedhaya dipandang sebagai sejenis yoga atau meditasi. " +
                    "Tarian Bedhaya adalah tarian klasik asal Keraton Surakarta. " +
                    "Tarian sakral ini menggambarkan hubungan asmara antara Ratu Kidul dengan Raja-raja Mataram yang diwujudkan dalam gerakan-gerakan tangan, dan seluruh bagian tubuh. " +
                    "Busana yang dipakai yakni sarung batik, serta atasan blus beludru serta selendang berwarna keemasan. " +
                    "Tarian diiringi oleh alat musik gamelan "))

        data?.add(DataModel(R.drawable.serimpi,"Tari Serimpi","Surakarta",
            "Tari Serimpi, tarian lokal ini disebut hampir mirip dengan tarian tradisional Jawa Tengah, Bedhaya. " +
                    "Hal ini bisa dilihat dari teknik menari, busana kostum, serta tarian yang diperagakan oleh wanita. " +
                    "Biasanya, tarian ini ditampilkan di Keraton Jawa Tengah untuk acara kebudayaan dan perayaan hari besar. " +
                    "Penarinya dianggap mewakili empat elemen universal bumi, air, api, dan udara, serta empat titik mata angin alam semesta. " +
                    "Sejarahnya menggambarkan pertarungan dengan belati keris antara empat pahlawan wanita. " +
                    "Tak jarang, tarian tradisional Jawa Tengah ini juga masih berbau mistis dan cukup sakral. " +
                    "Keunikan tari Serimpi ini adalah menggunakan properti pistol, dengan menggunakan busana sampir putih yang melambangkan kesucian dan ketulusan penari. " +
                    "Tarian ini juga melambangkan kelembutan yang terlihat dari gerak dan pengiringnya."))

        data?.add(DataModel(R.drawable.bondan,"Tari Bondan","Surakarta",
            "Tari Bondan merupakan salah satu tarian tradisional Jawa Tengah yang berasal dari Surakarta, Jawa Tengah. " +
                    "Tarian ini melambangkan seorang ibu yang menjaga anaknya dengan hati-hati. " +
                    "Menceritakan seorang anak dengan wanita yang sedang memegang boneka dan payung terbuka, menari dengan hati-hati di atas kendi dan tidak boleh diinjak dan dipatahkan. " +
                    "Tarian ini terbagi menjadi tiga, yaitu Cindogo Mariah, Mariah Mardisiwi, dan Mariah Pegunungan. " +
                    "Ciri tarian Bondan ini berbusana layaknya gadis desa, memegang keranjang, bertopi dan membawa alat-alat pertanian. "))

        data?.add(DataModel(R.drawable.beksan,"Tari Beksan Wireng","Surakarta",
            "Tarian ini dikatakan telah ada sejak abad ke-11. " +
                    "Tarian tradisional Jawa Tengah ini berasal dari Keraton Jawa yang lestari di Kasunanan Surakarta & di Pura Mangkunegaran. " +
                    "Tariannya adalah tentang perlawanan perang. Beksan Wireng diciptakan pada saat Amiluhur menjadi raja. " +
                    "Amiluhur ingin semua orang dapat berperang untuk melindungi kerajaannya, maka diciptakanlah tarian ini. " +
                    "Untuk menghormati dan meneruskannya, banyak penari dari Jawa Tengah yang mencoba menampilkan tarian seperti Beksan Wireng ini. "))

        data?.add(DataModel(R.drawable.gambir,"Tari Gambir Anom","Surakarta",
            "Gambir Anom adalah tarian tradisional Jawa Tengah tunggal yang dipopulerkan dari Surakarta. " +
                    "Biasanya diperagakan oleh laki-laki ataupun perempuan. Tarian Gambir Anom menggambarkan Irawan, putra Arjuna yang sedang jatuh cinta. " +
                    "Sosok yang sedang jatuh cinta diperagakan dengan cara ia mendandani dirinya sendiri, menata rambut, merias wajah, serta berbusana rapi. " +
                    "Adanya gerakan bercermin, berjalan mondar-mandir seperti pujaan hatinya berada di depannya. "))


        data?.add(DataModel(R.drawable.dolalak,"Tari Dolalak","Purworejo",
            "Dolalak merupakan produk budaya yang muncul dan berkembang di Kabupaten Purworejo Jawa Tengah. " +
                    "Bahkan, ini telah ada pada masa penjajahan Belanda di Indonesia sekitar tahun 1915. " +
                    "Tari Dolalak disajikan oleh beberapa orang penari berpakaian menyerupai tentara Belanda atau Perancis tempo dulu. " +
                    "Pertujunkkan diiringi bunyi-bunyi dari kentrung, rebana, kendang dan kecer. " +
                    "Terlihat dari kostum dan aksesorisnya yang mirip dengan tentara Belanda. " +
                    "Kostum yang dikenakan para penari Dolalak seperti baju berlengan panjang dengan lencana bahu, celana pendek, topi dan kaos kaki dilengkapi dengan kacamata hitam dan sampur."))

        data?.add(DataModel(R.drawable.lengger,"Tari Lengger","Banyumas",
            "Tarian Lengger merupakan salah satu tarian ritual tradisional Jawa Tengah Kuno. " +
                    "Sebagai simbol kesuburan, penari pria berdandan seperti wanita. " +
                    "Ketika tarian Lengger mulai dikenal, pria dianggap lebih kuat dan lebih murni daripada wanita. " +
                    "Secara garis besar fungsi Lengger sebagai ritual. " +
                    "Pada masa itu, Lengger dimainkan di punden (tempat sakral), diperlukan waktu tersendiri untuk melakukan kesenian ini, biasanya pada masa panen atau bersih desa. " +
                    "Pemain yang dipilih pun tidak sembarangan, yakni pemain yang dianggap bersih secara spiritual. " +
                    "Gerak tari Lenggersangat sederhana dan belum ada pakem untuk detail geraknya. " +
                    "Pada dasarnya masyarakat dahulu belum memiliki keterampilan yang khusus, seperti halnya yang di sebut Lengger \"geleng-geleng, lengang lenggeng gawe geger”. "))
        data?.add(DataModel(R.drawable.endel,"Tari Topeng Endel","Tegal",
            "Tari Topeng Endel merupakan tarian khas Tegal yang menggambarkan seorang wanita yang lenjeh atau genit. " +
                    "Tari Topeng Endel biasanya dibawakan oleh penari wanita dengan menggunakan topeng yang berwujud wanita cantik, murah senyum, dan berkulit wajah putih. " +
                    "Topeng Endel merupakan bentuk topeng wanita dengan kostum endel yang mirip penari Tari Gambyong yang diiringi gending lancaran ombak banyu laras slendro manyuro. " +
                    "Tari Endel kebanyakan digunakan untuk penyambutan tamu kehormatan. " +
                    "Seperti namanya, tari Endel menawarkan gerakan lincah nan endel alias kenes atau genit, Gerak penari memperlihatkan bayangan seolah sedang bercumbu dengan pangeran. " +
                    "Gemulainya para penari yang bergerak-gerak begitu lembut disertai dengan entakan gamelan, mampu menghipnosis siapapun yang menonton. " +
                    "Busana yang digunakan untuk Tari Topeng Endel mirip dengan kostum yang dikenakan penati Tari Gambyong. " +
                    "Dengan diiringi gending lancaran ombak banyu laras slendro manyuro, penari akan memperlihatkan bagaimana sosok wanita Jawa yang sesungguhnya. " +
                    "Penuh dengan sikap halus serta lembut nan keibuan. " +
                    "Sifat wanita ini sebenarnya tidak diartikan, bahwa seorang wanita Jawa adalah wanita terjajah. "))
        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("asal", item?.asal)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}