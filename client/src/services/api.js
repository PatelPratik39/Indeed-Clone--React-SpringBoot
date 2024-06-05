import axios from "axios";

const API_URL = "http://localhost:8080";

export const savePost = async (payload) => {
  try {
    return await axios.post(`${API_URL}`, payload);
  } catch (error) {
    console.log("Error : ", error.message);
    return error.response.data;
  }
};
