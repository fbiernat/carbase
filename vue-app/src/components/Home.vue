<template>
  <div class="container content-wrapper">
    <div class="jumbotron">
      <div class="jumbotron-content">
        <h1>Welcome to Carbase</h1>
        <p>
          Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce sed
          faucibus sem. Mauris quis neque vestibulum, ullamcorper enim nec,
          ornare ligula. Vestibulum convallis elit ac tortor ullamcorper
          lacinia. Sed facilisis nibh enim, at commodo dolor pharetra at.
          Vivamus a metus euismod, molestie risus sed, scelerisque eros.
          Suspendisse potenti. Morbi aliquam viverra risus mollis accumsan.
          Pellentesque sit amet dignissim nisl, eget lacinia ligula. Nunc
          euismod pulvinar lobortis.
        </p>
        <button class="btn btn-primary">Learn more</button>
      </div>
    </div>

    <div class="cards mt-2">
      <router-link to="/persons" tag="div" class="card">
        <div class="bg-icon">
          <i class="fa fa-user"></i>
        </div>
        <div class="content text-center">
          <h1>Persons</h1>
          <p class="color-gray">Show list of all car users</p>
        </div>
      </router-link>
      <router-link to="/cars" tag="div" class="card">
        <div class="bg-icon">
          <i class="fa fa-car"></i>
        </div>
        <div class="content text-center">
          <h1>Cars</h1>
          <p class="color-gray">Show list of all cars</p>
        </div>
      </router-link>
    </div>

    <h1 class="text-center mt-3">About Carbase</h1>
    <div class="narrow">
      <!-- <i class="fa fa-road car-bg"></i> -->
      <p>
        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce sed
        faucibus sem. Mauris quis neque vestibulum, ullamcorper enim nec, ornare
        ligula. Vestibulum convallis elit ac tortor ullamcorper lacinia. Sed
        facilisis nibh enim, at commodo dolor pharetra at. Vivamus a metus
        euismod, molestie risus sed, scelerisque eros. Suspendisse potenti.
        Morbi aliquam viverra risus mollis accumsan. Pellentesque sit amet
        dignissim nisl, eget lacinia ligula. Nunc euismod pulvinar lobortis.
        Curabitur et semper ex, vitae fermentum odio. Nulla facilisi. Fusce ut
        diam quis nunc porta faucibus. Suspendisse enim justo, iaculis ut purus
        eget, tincidunt mattis urna. Proin scelerisque venenatis commodo. Cras
        at imperdiet felis, vitae elementum enim.
      </p>

      <div class="quote">
        Aliquam nisi dui, congue vitae lacus sit amet, eleifend finibus velit.
        Orci varius natoque penatibus et magnis dis parturient montes, nascetur
        ridiculus mus.
      </div>

      <p>
        Aliquam nisi dui, congue vitae lacus sit amet, eleifend finibus velit.
        Orci varius natoque penatibus et magnis dis parturient montes, nascetur
        ridiculus mus. Aliquam nibh massa, tincidunt at lectus sit amet,
        malesuada ornare mauris. Nunc aliquet, ante at hendrerit accumsan, est
        purus gravida felis, imperdiet vehicula purus justo nec erat. Aenean
        arcu orci, lobortis in lorem eget, malesuada placerat quam. Mauris
        dapibus consectetur feugiat. Maecenas tincidunt aliquam libero ac
        commodo.
      </p>
    </div>
  </div>
</template>

<script>
export default {};
</script>

<style scoped>
.cards {
  display: flex;
}

.color-gray {
  color: darkslategray;
}

.card {
  cursor: pointer;
  flex: 1 0 auto;
  flex-direction: column;
  min-height: 350px;
  background-color: #f9dc5c;
  margin: 1rem;
  border-radius: 15px;
  display: flex;
  align-items: center;
  justify-content: center;
  position: relative;
  overflow: hidden;
  transition: all 1s;
}

.card:hover {
  background: black;
  transform: translateY(-15px);
  box-shadow: 5px 15px 15px rgba(0, 0, 0, 0.55);
}

.card .content {
  transition: all 1s;
}

.card:hover .content {
  transform: translateY(-20px) scale(1.4);
  transition: transform 0.5s;
  color: white;
}

.bg-icon {
  position: absolute;
  font-size: 15rem;
  bottom: -40px;
  left: -20px;
  color: rgba(0, 0, 0, 0.35);
  transform: rotate(15deg);
  transition: all 0.5s;
}

.card:hover .bg-icon {
  color: rgba(255, 255, 255, 0.35);
}

.content p {
  color: inherit;
}

.narrow {
  position: relative;
}

.car-bg {
  font-size: 7rem;
  color: rgba(0, 0, 0, 0.85);
  position: absolute;
  left: 3rem;
  top: -5rem;
  transform: rotate(25deg);
}

.quote {
  margin: 2rem 4rem;
  font-size: 1.5rem;
  line-height: 2rem;
}

.jumbotron {
  background-image: url("../../static/img/cars.jpg");
  background-size: cover;
  backdrop-filter: grayscale(0.5);
  background-blend-mode: saturation;
  height: 550px;
  position: relative;
  border-radius: 10px;
}

.jumbotron-content {
  position: absolute;
  backdrop-filter: blur(4px);
  bottom: 30px;
  left: 30px;
  max-width: 70%;
  color: rgba(0, 0, 0, 0.75);
  padding: 2rem;
  background: rgba(255, 255, 255, 0.45);
  border-radius: 5px;
}

@media screen and (max-width: 900px) {
  .cards {
    display: block;
    max-width: 80%;
    margin: auto;
  }

  .narrow {
    padding: 0;
  }
}
</style>
