# 과자 맞춤 추천 서비스, SOCK

![sock-logo-color](https://user-images.githubusercontent.com/89503136/230081905-39f6ad61-ba5d-477c-b7c0-843e13eb3477.png)

## 0.서비스 소개 영상
[![Video Label](http://img.youtube.com/vi/SHkfcsrD5Do/0.jpg)](https://www.youtube.com/SHkfcsrD5Do)

## 1. 프로젝트 개요

### 1) 프로젝트 목표

늘 먹는 똑같은 과자에 질린 사람, 새로운 과자를 원하는 사람들을 위한 과자 맞춤 추천 서비스

### 2) 주요 기능 ⚙

1. 사용자 취향 분석을 통한 과자 맞춤 추천
2. 테마별 과자 추천
3. 과자 정보 확인, 리뷰 작성, 좋아요 추가
4. 레시피 작성, 댓글, 좋아요 추가
5. 추천 레시피, 유사한 상품 목록 조회
6. 과자 이상형 월드컵, 과자 MBTI 등 이벤트

### 3) 전체 일정 📅

23.02.20 ~ 23.04.07 (6주)

| 기간          | 내용                                 |
| ------------- | ------------------------------------ |
| 02.20 ~ 02.22 | 아이디어 선정                        |
| 02.23 ~ 02.27 | 요구사항 분석 및 기능 명세서 작성    |
| 02.28 ~ 03.03 | 와이어프레임, REST API 작성          |
| 03.06 ~ 03.10 | 회원가입, 로그인 등 회원 서비스 개발 |
| 03.13 ~ 03.24 | 과자, 레시피 기능 개발               |
| 03.27 ~ 03.31 | 서비스 배포 자동화                   |
| 04.03 ~ 04.07 | 서비스 유지보수                      |

### 4) 구성원 🥰

<table>
  <tr>
    <td align="center"><b>Name</b></td>
    <td align="center"><b>김건현</b></td>
    <td align="center"><b>고영석</b></td>
    <td align="center"><b>김수빈</b></td>
    <td align="center"><b>서영탁</b></td>
    <td align="center"><b>이채은</b></td>
    <td align="center"><b>정민우</b></td>
  </tr>
  <tr>
    <td align="center"><b>Github</b></td>
    <td align="center"><a href="https://github.com/gggeon96"><img src="https://avatars.githubusercontent.com/u/39759666?v=4" width="100px;" alt=""/></td>
    <td align="center"><a href="https://github.com/YoungSeok222222"><img src="https://avatars.githubusercontent.com/u/109319895?v=4" width="100px;" alt=""/></td>
    <td align="center"><a href="https://github.com/tabss2003"><img src="https://avatars.githubusercontent.com/u/43884708?v=4" width="100px;" alt=""/><br /></td>
    <td align="center"><a href="https://github.com/0takkk"><img src="https://avatars.githubusercontent.com/u/89503136?s=400&v=4" width="100px;" alt=""/><br /></td>
    <td align="center"><a href="https://github.com/rachaen"><img src="https://avatars.githubusercontent.com/u/78066837?v=4" width="100px;" alt=""/><br /></td>
    <td align="center"><a href="https://github.com/meanwo"><img src="https://avatars.githubusercontent.com/u/86656448?v=4" width="100px;" alt=""/><br /></td>
  </tr>
  <tr>
    <td align="center"><b>Position</b></td>
    <td align="center"><b>👑 Backend</b></td>
    <td align="center"><b>Frontend</b></td>
    <td align="center"><b>Backend</b></td>
    <td align="center"><b>Backend</b></td>
    <td align="center"><b>Frontend</b></td>
    <td align="center"><b>Frontend / AI</b></td>
  </tr>
</table>

<br>

## 2. 프로젝트 설계

### 1) [피그마](https://www.figma.com/file/9kJFJj9jMh0RsnJRDrtD5y/SOCK-%EC%8F%99?node-id=555-2594&t=RxoqHeSvt11Ep7XA-0)

### 2) 개발환경

| Backend            | FestAPI         | Frontend   | CI      | Collaboration Tools |
| ------------------ | --------------- | ---------- | ------- | ------------------- |
| Java 11            | Python          | React      | AWS EC2 | GitLab              |
| Spring Boot Gradle | scikit-surprise | TypeScript | Docker  | Jira                |
| Spring Data JPA    | scikit-learn    | node.js    | Jenkins | Notion              |
| QueryDSL           | beautifulsoup4  | Redux      |         | Discord             |
| JWT                |                 | Firebase   |         |                     |
| Spring Security    |                 |            |         |                     |
| MySQL              |                 |            |         |                     |
| Redis              |                 |            |         |                     |

### 3) ERD

<img width="973" alt="image" src="https://user-images.githubusercontent.com/89503136/230094798-063f31ec-1e39-4217-95b9-ced06e703ccf.png">

### 4) 아키텍처

<img width="704" alt="image" src="https://user-images.githubusercontent.com/39759666/230249124-0870e0ba-3f48-40f6-96d0-71faffcb6ce3.png">

### 5) [REST API](https://www.notion.so/API-677411b5c72c41cdb1e88bad01abd363?pvs=4)

</br>

## 3. 프로젝트 소개

### 로그인 및 선호도 조사

![로그인 및 선호도 조사](https://user-images.githubusercontent.com/89503136/230250457-15939e80-3a54-42a1-b9ef-14c922b94322.gif)

### 과자 맞춤 추천

![과자 맞춤 추천](https://user-images.githubusercontent.com/89503136/230254341-f68ba551-8508-418d-99e4-f75cc9626002.gif)

### 테마별 추천

![2  테마별 추천1](https://user-images.githubusercontent.com/89503136/230251822-2e8f5b08-9329-4922-a0a2-9e96f7c217c6.gif)

### 과자 상세조회

![3  과자 상세조회](https://user-images.githubusercontent.com/89503136/230253746-84bd534f-da4b-439e-b8d9-5953e9c450fd.gif)

### 검색

![검색](https://user-images.githubusercontent.com/89503136/230255473-2e5c38fd-54a9-4bd1-a78f-b70170a65b3b.gif)

### 레시피 작성

![레시피 작성](https://user-images.githubusercontent.com/89503136/230259024-200eb910-be2b-4e19-a99a-cb9578765e1a.gif)

### 마이프로필

![마이프로필1](https://user-images.githubusercontent.com/89503136/230262045-afc2c4ca-835e-4661-9603-fceca94633b6.gif)

### 이벤트(과자 MBTI)

![SBTI](https://user-images.githubusercontent.com/89503136/230272644-2fb20a06-214c-4213-aa1f-6630516a7bdf.gif)

### 이벤트(과자 이상형 월드컵)

![과자 이상형 월드컵](https://user-images.githubusercontent.com/89503136/230272895-3c25dfc6-51fb-444a-82e6-0c412663cdc1.gif)

## 4. 발표 자료

[C103 SOCK 최종발표자료.pdf](https://github.com/0takkk/Algorithm/files/11175663/C103_SOCK_.pdf)
