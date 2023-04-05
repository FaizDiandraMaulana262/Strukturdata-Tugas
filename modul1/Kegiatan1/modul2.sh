#Modul2/BashScript

#Install Library
libInstall(){
	sudo yum install tree
}

#Kegiatan 1
keg1(){
	cd /home
	sudo mkdir musik gambar video
	for x in {1..5}; do sudo touch lagu$x.mp3 gambar$x.jpg rekaman$x.avi; 
	done
	sudo mv *.mp3 musik
	sudo mv *.jpg gambar
	sudo mv *.avi video

	cd ~
	mkdir keluarga teman kerja
	sudo mv /home/musik/* /home/student/keluarga
	sudo mv	/home/gambar/* /home/student/teman
	sudo mv	/home/video/* /home/student/kerja
	
	tree .
}

#Kegiatan 2
keg2(){
	mkdir backups files
	touch files/source.file
	ln files/source.file backups/source.backup
	ls -l files/source.file backups/source.backup
	ln -sd /tmp ~/tempdir
	ls -ld tempdir
}

keg3(){
	sudo su - <<EOF
	mkdir /home/modul2
	chown :student /home/modul2
	ls -ld modul2
	chmod g+w /home/modul2
	ls -ld modul2
	chmod 770 /home/modul2
	touch /home/modul2/modul2.txt
	ls -l /home/modul2/modul2.txt
	chown student /home/modul2/modul2.txt
EOF
}

keg4(){
	sudo -i --user=operator1 <<EOF
	umask
	mkdir /tmp/shared 
	ls -ld /tmp/shared 
	touch /tmp/shared/default
	ls -l /tmp/shared/default
	chmod g+s /tmp/shared
	echo "umask 007" >> ~/.bashrc
	. ~/.bashrc
	umask
EOF
}

#Run
# libInstall
keg1
keg2
keg3
keg4
