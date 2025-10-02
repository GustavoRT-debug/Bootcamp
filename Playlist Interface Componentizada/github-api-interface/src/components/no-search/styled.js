import styled from "styled-components";

export const Wrapper = styled.div`
  margin: 16px;
  display: flex;
  justify-content: center;
  gap: 8px;

  input {
    padding: 8px;
    font-size: 16px;
    border-radius: 8px;
    border: 1px solid #ccc;
    outline: none;
  }

  button {
    padding: 8px 16px;
    background-color: #0366d6;
    color: white;
    border: none;
    border-radius: 8px;
    cursor: pointer;
    font-weight: bold;

    &:hover {
      background-color: #0255b5;
    }
  }
`;
