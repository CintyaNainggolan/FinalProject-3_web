Final Project 3 - Standarization

Testing : Web Automation E-Commerce (https://www.jakmall.com/)
Tester : Cintya Yossy Silvana Nainggolan

Testcase: memiliki 2 subfolder yaitu Web Automation dan Mobile Automation.
- Web Automation
TC-01 : Login - Add product to cart - Cart page_HandphoneTablet
TC-02 : Login - Add product to cart - Cart page_KomputerLaptop
TC-03 : Login - Add product to cart - Cart page_Elektronik
Testcase ini diberikan penamaan sesuai apa saja yang dilakukan pada testcase tersebut yaitu berupa Login, memasukkan item ke keranjang, dan pergi ke halaman cart list.
Testcase ini dilakukan perkategori, jika ingin melakukan pengujian terhadap kategori lainnya silahkan menambah nama kategori di belakangnya.

- Mobile Automation
Untuk melakukan mobile testing, saya mengalami kendala karena device saya masih tidak dapat terhubung dengan Katalon saya. 
Saya sudah mencoba menggunakan emulator dengan Android Studio, tetapi tampaknya laptop saya tidak mampu menangani Katalon dan Android Studio secara bersamaan. 

Keywords:
Package bernama Helper.
Dan di dalam package Helper terdapat keyword Login untuk membantu mempersingkat step pada testcase.
Di dalam keyword login terdapat:
1. Settext email
2. Settext password
3. Click button login

Test Suites dan Test Suite Collection:
Test suite dapat digabungkan berdasarkan kategori yang memiliki kemiripan. Dalam hal ini kategori HandphoneTablet dan KomputerLaptop memiliki kemiripan. 
Test suite dapat digabungkan menjadi test suite collection untuk mempermudah melakukan pengujian sekaligus untuk semua Test Suite.

Data Files:
DataFiles diberi nama sesuai dengan format data files yang dibuat. Dalam hal ini data files berupa format Excel sehingga penamaan adalah excelData.dat
Isi dari excelData adalah informasi untuk login berupa email dan password, dan juga ada kategori, subkategori dan sub-sub kategori. Hanya saja pada hal ini subkategori dan sub-subkategori tidak digunakan.

Object Repository:
Ada object repository yang saya create manual yaitu object repository Kategori. Ini berguna untuk kategori yang akan diambil dari datafiles.
