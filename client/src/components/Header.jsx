import React from "react";
import { AppBar, Toolbar, styled } from "@mui/material";



const StyledAppbar = styled(AppBar)({
    background: '#2d2d2d',
    height:64
})

const Header = () => {
  const logo =
    "https://get-staffed.com/wp-content/uploads/2020/07/indeed-logo.png";
  return (
    <>
      <StyledAppbar>
        <Toolbar>
          <img src={logo} alt="logo" style={{ width: 95, marginBottom: 7 }} />
          
          Post a Job Find a Job
        </Toolbar>
      </StyledAppbar>
    </>
  );
};

export default Header;
