<template>
  <div class="card" v-if="person">
    <div class="row">
      <img src="../../../static/img/user.png" alt="" class="user-image" />
      <div class="info flex-grow">
        <p class="text-bigger">{{ person.firstName }} {{ person.lastName }}</p>
        <p class="text-bigger">{{ person.email }}</p>
        <p>
          Number of cars
          <span class="text-bigger">{{ person.cars.length }}</span>
        </p>
        <p>Cars</p>
        <ul>
          <li v-for="(car, idx) in person.cars" :key="idx">
            {{ car.make }} {{ car.model }}
          </li>
        </ul>
      </div>
    </div>
    <div class="row flex-end">
      <div class="buttons">
        <button class="btn" @click="editProfile">Edit Profile</button>
        <button class="btn" @click="deletePerson">Delete Person</button>
      </div>
    </div>
  </div>
  <div v-else>
    <p>No data</p>
  </div>
</template>

<script>
import { getNotification, scrollTop } from "../../utils";

export default {
  props: ["person"],
  methods: {
    editProfile() {
      this.$router.push({ path: `/persons/${this.person.id}` });
    },
    deletePerson() {
      const url = `persons/${this.person.id}`;
      this.$http.delete(url).then(
        () => {
          this.$emit(
            "notify",
            getNotification("success", "Successfully deleted person profile")
          );
          this.$emit("ondelete", this.person.id);
          scrollTop();
        },
        error => {
          this.$emit(
            "notify",
            getNotification("error", "Error while deleting person profile")
          );
        }
      );
    }
  }
};
</script>

<style scoped>
.text-bigger {
  font-size: 2.1rem;
}

.user-image {
  width: 200px;
  height: 200px;
  margin: 1rem;
}

table {
  width: 100%;
}

td {
  min-width: 150px;
}

.card {
  max-width: 70%;
  margin: 1.5rem auto;
  padding: 1rem;
  border: 5px solid #f9dc5c;
  box-shadow: 5px 5px 0 rgba(0, 0, 0, 0.05);
}

.card .row {
  display: flex;
  align-items: center;
}

@media screen and (max-width: 900px) {
  .buttons {
    display: block;
  }

  .card {
    max-width: 100%;
  }
}
</style>