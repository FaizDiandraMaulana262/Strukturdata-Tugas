import requests
  
# defining the api-endpoint 
# API_ENDPOINT = "https://infotech.umm.ac.id/sevenman/loan_lab/store HTTP/2"

# data = {'api_dev_key':API_KEY,
#         'api_option':'paste',
#         'api_paste_code':source_code,
#         'api_paste_format':'python'}
  
# # sending post request and saving response as response object
# r = requests.post(url = API_ENDPOINT, data = data)


val = "POST /sevenman/index.php/loan_lab/store HTTP/2\nHost: infotech.umm.ac.id\nCookie: twk_idm_key=lDuISnWLQ0zaEQRldas2t; _ga=GA1.1.1407651697.1677657382; TawkConnectionTime=0; twk_uuid_6046efd5385de407571dfd5a=%7B%22uuid%22%3A%221.PUk1cVv1oh3K4beoVeUnfPwHMHn97T9APAdDWp3CWoFKdESOrJNii17rVi8aZ4k54O2PBSd0jL0bp5VjvGl5XUGTIjxyY2iSKxLVFUZXuV5BFS4UA%22%2C%22version%22%3A3%2C%22domain%22%3A%22umm.ac.id%22%2C%22ts%22%3A1678187991604%7D; _ga_57T7SCJCQV=GS1.1.1678263292.7.0.1678263292.0.0.0; ci_session=1gdidl2icohphqbqbtqq8367kjk1ujom\nContent-Length: 101\nCache-Control: max-age=0\nSec-Ch-Ua: "Google Chrome";v="111", "Not(A:Brand";v="8", "Chromium";v="111"\nSec-Ch-Ua-Mobile: ?0\nSec-Ch-Ua-Platform: "Windows"\nUpgrade-Insecure-Requests: 1\nOrigin: https://infotech.umm.ac.id\nContent-Type: application/x-www-form-urlencoded\nUser-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/111.0.0.0 Safari/537.36\nAccept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7\nSec-Fetch-Site: same-origin\nSec-Fetch-Mode: navigate\nSec-Fetch-User: ?1\nSec-Fetch-Dest: document\nReferer: https://infotech.umm.ac.id/sevenman/index.php/loan_lab/create\nAccept-Encoding: gzip, deflate\nAccept-Language: id-ID,id;q=0.9,en-US;q=0.8,en;q=0.7"
r = requests.post('https://infotech.umm.ac.id/sevenman/loan_lab/store HTTP/2', data={'key': val})
print(r)